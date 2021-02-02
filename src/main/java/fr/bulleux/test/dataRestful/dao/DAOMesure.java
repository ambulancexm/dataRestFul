package fr.bulleux.test.dataRestful.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import fr.bulleux.test.dataRestful.beans.Mesure;

public class DAOMesure implements Dao<Mesure> {

	@Override
	public Optional<Mesure> get(long id) {

		return null;
	}

	@Override
	public List<Mesure> getAll() {
		try {
			List<Mesure> mesures = new ArrayList<Mesure>();
			String sql = "SELECT nom_mesure,unite from mesure";
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				Mesure m = new Mesure(null, rs.getString("nom_mesure"), rs.getString("unite"));
				LOGGER.debug(m.toString());
				mesures.add(m);
			}
			return mesures;

		} catch (Exception e) {
			LOGGER.error("getAll => " + e.getMessage() + " : " + e.getStackTrace());
		}

		return null;

	}

	@Override
	public void save(Mesure t) {
		try {
			String sql = "INSERT INTO mesure(nom_mesure, unite) VALUES(?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, t.getNomMesure());
			ps.setString(2, t.getUniteMesure());
			boolean rtExecute = ps.execute();

			LOGGER.debug("le mesure est inseré");

		} catch (Exception e) {
			LOGGER.warn("exeption insertion de message" + e.getMessage() + " ; " + e.getCause());
			LOGGER.debug("pas d'insertion");
		}

	}
	
	/**
	 * pas moyende chager le nom de lea mesure c'est un champ UNIQUE
	 * mais je garde le tableau de string quand meme
	 */
	@Override
	public void update(Mesure t, String[] params) {
			
		try {
			String sql = "UPDATE mesure SET `unite`=? WHERE id_mesure LIKE ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			System.out.println("liste des param [" +params[0] + " : " + params[1] +" : "+  t.getIdMesure() + "] " );
			ps.setString(1, params[1]);
			
			ps.setLong(2, t.getIdMesure());
			System.out.println(sql);
			ps.execute();
		} catch (Exception e) {
			LOGGER.debug("la mise a jour n'a pas fonctionnée " + e.getMessage());
		}

	}

	@Override
	public String delete(Mesure t) {
		// TODO Auto-generated method stub
		return null;
	}

}
