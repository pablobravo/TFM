package impl.tfm.presentation.acceso;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tfm.business.ProductoManagerService;
import com.tfm.business.UsuarioManagerService;
import com.tfm.model.Producto;
import com.tfm.model.Usuario;

@Controller
@RequestMapping ("/acceso")
public class AccesoController {

	@Autowired
	private UsuarioManagerService usuarioManagerService;
	
	public void setUsuarioManagerService(UsuarioManagerService usuarioManagerService) {
		this.usuarioManagerService = usuarioManagerService;
	}
	
	@Autowired(required=true)
	ProductoManagerService productoManagerService;
	
	
	public void setProductoManagerService(ProductoManagerService productoManagerService) {
		this.productoManagerService = productoManagerService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public void get(Model model) throws Exception
	{
		System.out.println("Ejecutando el método GET");

	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String iniciarSesion(HttpServletRequest request, @Valid @ModelAttribute Usuario usuario, Model model, BindingResult result) throws Exception
	{
		String password = usuario.getPassword();
		String email = usuario.getEmail();	
		
		
		Vector<Usuario> usuarios=  usuarioManagerService.getUsuarios();
		boolean existe = false;
		for(Usuario b: usuarios){
			if((b.getEmail().equals(email) || b.getNombre().equals(email)) && b.getPassword().equals(password)){
				existe= true;
				request.getSession().setAttribute("sesion", b);
			}
		}
		
	
		if(!existe){
			model.addAttribute("error", "Usuario o contraseña incorrectos");
			return "acceso";	
		}
		
		Vector<Producto> productos = productoManagerService.getProductos();
		request.getSession().setAttribute("productos", productos);
		return "/inicio";
	}
	
	@ModelAttribute("usuario") 
	public Usuario getUsuario()
	{ 
		return new Usuario();
	}
}
