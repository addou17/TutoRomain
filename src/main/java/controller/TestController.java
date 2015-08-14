package controller;

import java.util.List;

import model.Personne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.PersonneService;

@Controller
@RequestMapping("lien")
public class TestController {

	@Autowired
	private PersonneService personneService;

	@RequestMapping("/click")
	public String test(Model model) {
		model.addAttribute("personne", new Personne());
		return "pageTest"; //Le nom de la page sur laquelle les r�sultats sont affich�s
	}
	@RequestMapping("/affichage")
	public String afficher(Model model)
	{
		
		List<Personne> toutLeMonde= personneService.retrieveAllPersonnes();
		model.addAttribute("toutLeMonde",toutLeMonde);
		return "affichage";
	}

	@RequestMapping(value = "/click", method = RequestMethod.POST)
	public ModelAndView retest(@ModelAttribute("personne") Personne personne) {
		ModelAndView mav = new ModelAndView("pageResultat");
		mav.addObject("personne", personne);
		personneService.create(personne);

		return mav;
	}

}
