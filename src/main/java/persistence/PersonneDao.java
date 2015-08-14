package persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import persistence.mapper.PersonneRowMapper;
import model.Personne;

@Repository	//Annotation pour les DAO
public class PersonneDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void create(Personne personne ) {
		String request = "insert into Personne (NOM, PRENOM, AGE) Values (?, ?, ?)";
		jdbcTemplate.update(request, personne.getNom(), personne.getPrenom(), personne.getAge());
	}
	
	
	public Personne retrieveById(Integer id)
	{
		String request="Select * from Personne where ID=?";
		Personne personne = jdbcTemplate.queryForObject(request, new Object[] { id }, new PersonneRowMapper());
		return personne;
	}
	
	public List<Personne> retrieveAllPersonnes()
	{
		String request="Select * from Personne";
		List<Personne> personnes = jdbcTemplate.query(request, new PersonneRowMapper());
		
		return personnes;
	}

}
