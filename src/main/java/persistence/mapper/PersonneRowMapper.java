package persistence.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Personne;

import org.springframework.jdbc.core.RowMapper;

public class PersonneRowMapper implements RowMapper<Personne> {

	public Personne mapRow(ResultSet rs, int arg1) throws SQLException {
		Personne personne = new Personne();
		personne.setId( rs.getInt( "ID" ));
		personne.setAge( rs.getInt( "AGE" ) );
		personne.setNom( rs.getString( "NOM" ));
		personne.setPrenom( rs.getString( "PRENOM" ));
		return personne;
	}

}
