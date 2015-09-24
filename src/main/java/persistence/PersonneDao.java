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
	private JdbcTemplate jdbcTemplate;

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
	public void update(Personne pers)
	{
		String request = "Update Personne set NOM=?, PRENOM=?, AGE=? where ID=?";
		jdbcTemplate.update(request, pers.getNom(), pers.getPrenom(), pers.getAge(), pers.getId());
	}
	public void delete (Integer id)
	{
		String request="Delete from Personne where ID=?";
		jdbcTemplate.update(request, id);
	}

}
