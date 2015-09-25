package service;

import java.util.List;

import model.Commentaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistence.CommentaireDao;

@Service
public class CommentaireService {

@Autowired
private CommentaireDao cd;



public Commentaire retrieveById(Integer id)
{
	return cd.retrieveById(id);
}

public List<Commentaire> retrieveByPersonneId(Integer idPersonne)
{
	return cd.retrieveByPersonneId(idPersonne);
}


public void create(Commentaire commentaire)
{
	cd.create(commentaire);
}


	
}
