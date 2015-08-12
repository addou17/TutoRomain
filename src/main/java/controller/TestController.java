package controller;

import model.Personne;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("lien")
public class TestController {
	
	@RequestMapping("/click")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView("pageTest");	
		mav.addObject("personne", new Personne());
		return mav;
	}
	
	@RequestMapping( value = "/click", method = RequestMethod.POST )
	public ModelAndView retest(@ModelAttribute("personne") Personne personne) {
		ModelAndView mav = new ModelAndView("pageResultat");
		
		
		
		return mav;
	}

}
