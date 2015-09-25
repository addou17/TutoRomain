package controller;

import model.Commentaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	@RequestMapping(value = "ajoutcommentaire", method = RequestMethod.POST)
	public String ajoutercommentaire(
			@ModelAttribute("commentaire") Commentaire commentaire) {
		cs.create(commentaire);
		return "redirect:/commentaires/"+ commentaire.getIdPersonne();
	}

	@RequestMapping("commentaires/{id}")
	public String afficherCommentaires(Model model,
			@PathVariable("id") Integer id) {
		Commentaire commentaire = new Commentaire();
		commentaire.setIdPersonne(id);
		model.addAttribute("commentaire", commentaire);
		model.addAttribute("personne", ps.retrieveById(id));
		model.addAttribute("listeCommentaires", cs.retrieveByPersonneId(id));
		return "afficherComs";
	}

}
