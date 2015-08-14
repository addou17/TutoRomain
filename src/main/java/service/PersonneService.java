package service;

import java.util.List;
import java.util.logging.Logger;

import model.Personne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistence.PersonneDao;

@Service
public class PersonneService {

	@Autowired
	private PersonneDao personneDao;
	Logger log;

	public void create(Personne personne) {
		personneDao.create(personne);
		Logger logger = Logger.getLogger("PersonneService");
		logger.info("Personne créée");
	}

	public Personne retrieveById(Integer id) {
		return personneDao.retrieveById(id);
	}

	public List<Personne> retrieveAllPersonnes() {
		return personneDao.retrieveAllPersonnes();
	}

	public void update(Personne pers) {
		personneDao.update(pers);
	}

	public void delete(Integer id) {
		personneDao.delete(id);
	}

}
