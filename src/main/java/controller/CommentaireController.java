package controller;

import model.Commentaire;
import model.Personne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.CommentaireService;
import service.PersonneService;

@Controller
public class CommentaireController {

	@Autowired
	private CommentaireService cs;

	@Autowired
	private PersonneService ps;

	@RequestMapping("/ajouter")
	public String ajouterObjetCommentaire(Model model) {

		model.addAttribute("commentaire", new Commentaire());
		return "ajoutcommentaire";

	}

	@RequestMapping(value = "/ajouter", method = RequestMethod.POST)
	public ModelAndView ajoutercommentaire(
			@ModelAttribute("commentaire") Commentaire commentaire) {
		ModelAndView mav = new ModelAndView();
		mav.addObject(commentaire);

		return mav;
	}

	@RequestMapping("commentaires/{id}")
	public String afficherCommentaires(Model model,
			@PathVariable("id") Integer id) {
		model.addAttribute("personne", ps.retrieveById(id));
		model.addAttribute("listeCommentaires", cs.retrieveByPersonneId(id));
		return "afficherComs";
	}

}
