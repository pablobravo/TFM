package impl.tfm.presentation.carrito;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarritoController {
	@RequestMapping ("/carrito")
	public String carrito(Model model)
	{
		return "/carrito";
	}
	
}
