package impl.tfm.presentation.politicas;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PoliticasTiendaController {
	
	@RequestMapping ("/privacidad")
	public String privacidad()
	{

		return "/privacidad";
	}
	
	@RequestMapping ("/acercade")
	public String acercade()
	{

		return "/acercade";
	}
	
	@RequestMapping ("/terminos")
	public String terminos()
	{

		return "/terminos";
	}
	

}
