package impl.tfm.presentation.envioypago;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tfm.model.Usuario;

@Controller
public class EnvioYPagoController {

	@RequestMapping("/envioypago")
	public String inicio(HttpServletRequest request, Model m) throws Exception {
		System.out.println("Ejecutando controlador envío y pago");
		
		

		return "/envioypago";
	}
	
	@ModelAttribute("usuario") 
	public Usuario getUsuario()
	{ 
		return new Usuario();
	}
}
