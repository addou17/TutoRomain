package persistence;

import java.util.List;

import model.Commentaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import persistence.mapper.CommentaireRowMapper;


@Repository
public class CommentaireDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Commentaire retrieveById(Integer id)
	{
		String request="select * from Commentaire where ID=?";
		Commentaire commenatire = jdbcTemplate.queryForObject(request, new Object[] { id }, new CommentaireRowMapper());
		return commenatire;
				
	}
	public List<Commentaire> retrieveByPersonneId(Integer idPersonne)
	{
		String request="select * from Commentaire where ID_PERSONNE=?";
		List<Commentaire> commenatires = jdbcTemplate.query(request, new Object[] { idPersonne }, new CommentaireRowMapper());
		return commenatires;
		
				
	}
	
	
	public void create(Commentaire commentaire)
	{
		String request = "insert into Personne (COMMENTAIRE, ID_PERSONNE, PSEUDO) Values ( ?, ?, ?)";
		jdbcTemplate.update(request, commentaire.getCommentaire(), commentaire.getIdPersonne(), commentaire.getPseudo());
	}
	
	
	public void update(Commentaire commentaire)
	{
//		TODO
//		String request = "Update Personne set NOM=?, PRENOM=?, AGE=? where ID=?";
//		jdbcTemplate.update(request, pers.getNom(), pers.getPrenom(), pers.getAge(), pers.getId());
	}
	public void delete (Integer id)
	{
		//TODO
//		String request="Delete from Personne where ID=?";
//		jdbcTemplate.update(request, id);
	}

	
}
