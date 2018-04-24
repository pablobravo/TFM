package impl.tfm.presentation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Error {

	
	@RequestMapping(value="/404")
	public String error404(HttpServletRequest request, Model m) throws Exception {
		return "/error";
	}
	
	@RequestMapping(value="/400")
	public String error400(HttpServletRequest request, Model m) throws Exception {
		return "/error";
	}
	
	@RequestMapping(value="/500")
	public String error500(HttpServletRequest request, Model m) throws Exception {
		return "/error";
	}
	


	
}
