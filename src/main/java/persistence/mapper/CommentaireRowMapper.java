package persistence.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Commentaire;

import org.springframework.jdbc.core.RowMapper;

public class CommentaireRowMapper implements RowMapper<Commentaire> {

	public Commentaire mapRow(ResultSet arg0, int arg1) throws SQLException {
		Commentaire commentaire = new Commentaire();
		commentaire.setId(arg0.getInt("ID"));
		commentaire.setCommentaire(arg0.getString("COMMENTAIRE"));
		commentaire.setIdPersonne(arg0.getInt("ID_PERSONNE"));
		commentaire.setPseudo(arg0.getString("PSEUDO"));
		return commentaire;
	}

}
