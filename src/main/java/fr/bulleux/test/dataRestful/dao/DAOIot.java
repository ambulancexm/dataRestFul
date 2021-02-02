package fr.bulleux.test.dataRestful.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.bulleux.test.dataRestful.beans.Iot;

public class DAOIot implements Dao<Iot> {

	DAOProjet daoProjet;
	static final Logger LOGGER = LoggerFactory.getLogger(DAOIot.class.getName());

	@Override
	public Optional<Iot> get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Iot> getAll() {
		List<Iot> iots = new ArrayList<Iot>();
		String sql = "SELECT * FROM iot";
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return iots;
	}

	@Override
	public void save(Iot t) {
		boolean stateIot = false;
		ArrayList<String> iots = new ArrayList<String>();
		String mac = t.getMac();
		try {
			String sql = "SELECT mac FROM iot";
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			
			while (rs.next()) {
				
				iots.add(rs.getString("mac"));
				System.out.println(rs.getString("mac"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (String iot : iots) {
			
			LOGGER.debug("liste adresse MAC :  "+ iot.toString());
			if (iot.toString().equals(mac)) {
				stateIot = true;
			}
		}

		if (stateIot == false) {
			try {
				String sql = "INSERT INTO iot(mac,projet_id,position_id) VALUES(?,?,?)";
				PreparedStatement ps = connection.prepareStatement(sql);

				ps.setString(1, mac);
				ps.setLong(2, t.getProjet());
				ps.setLong(3, t.getPosition());
				boolean rtExecute = ps.execute();

				if (rtExecute == false) {
					LOGGER.debug("le iot est inseré");
				}

			} catch (Exception e) {
				LOGGER.error("exeption insertion de message Dao IOT " + e.getMessage() + " ; " + e.getCause());
			}
		} else {
			LOGGER.debug("pas d'insertion");
		}
	}

	@Override
	public void update(Iot t, String[] params) {
		// TODO Auto-generated method stub

	}

	@Override
	public String delete(Iot t) {
		// TODO Auto-generated method stub
		return null;
	}

}
