package controller;

import java.util.List;

import model.Personne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
		return "pageTest"; // Le nom de la page sur laquelle les résultats sont
							// affichés
	}

	@RequestMapping("/affichage")
	public String afficher(Model model) {

		List<Personne> toutLeMonde = personneService.retrieveAllPersonnes();
		model.addAttribute("toutLeMonde", toutLeMonde);
		return "affichage";
	}

	@RequestMapping(value = "/click", method = RequestMethod.POST)
	public ModelAndView retest(@ModelAttribute("personne") Personne personne) {
		ModelAndView mav = new ModelAndView("pageResultat");
		mav.addObject("personne", personne);
		if (personne.getId() != null) {
			personneService.update(personne);
		} else {
			personneService.create(personne);
		}

		return mav;
	}

	@RequestMapping("/delete/{id}")
	public String afficher(@PathVariable("id") Integer id) {
		personneService.delete(id);
		return "redirect:/lien/affichage";
	}

	@RequestMapping("/update/{id}")
	public String modifier(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("personne", personneService.retrieveById(id));
		return "pageTest";
	}
}
