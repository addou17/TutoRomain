package service;

import java.util.List;
import java.util.logging.Logger;

import model.Personne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistence.PersonneDao;
import persistence.mapper.PersonneRowMapper;

@Service
public class PersonneService {

	
	@Autowired
	private PersonneDao personneDao;
	Logger log ;
	public void create(Personne personne ) {
		personneDao.create(personne);
		Logger logger = Logger.getLogger("PersonneService");
		logger.info("Personne créée");
	}
	
	public Personne retrieveById(Integer id)
	{
		return personneDao.retrieveById(id);
	}
	
}
