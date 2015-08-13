package persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.Personne;

@Repository	//Annotation pour les DAO
public class PersonneDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void create(Personne personne ) {
		String request = "insert into Personne (NOM, PRENOM, AGE) Values (?, ?, ?)";
		jdbcTemplate.update(request, personne.getNom(), personne.getPrenom(), personne.getAge());
	}
	

}
