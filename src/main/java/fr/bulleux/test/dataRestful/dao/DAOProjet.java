package fr.bulleux.test.dataRestful.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.bulleux.test.dataRestful.beans.Projet;

public class DAOProjet implements Dao<Projet> {
	
	static final Logger LOGGER = LoggerFactory.getLogger(DAOProjet.class.getName());
	
	private List<Projet> projets = new ArrayList<Projet>();

	@Override
	public Optional<Projet> get(long id) {
		return Optional.ofNullable(projets.get((int) id));
	}

	@Override
	public List<Projet> getAll() {
		try {
			List<Projet> projets = new ArrayList<Projet>(); 
			String sql = "SELECT DISTINCT nom from projet";
			System.out.println(sql);
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				projets.add(new Projet(null,rs.getString("nom")));
			}
			return projets;
			
		} catch (Exception e) {
			LOGGER.error("getAll => "+ e.getMessage()+ " : " + e.getStackTrace());
		}
		
		return null;
	}

	@Override
	public void save(Projet t) {
		
		String nomProjet = t.getNom();
		boolean stateProjet = false;
		ArrayList<Projet> projets = (ArrayList<Projet>) getAll();

		// on rend la valeur du nom unique
		for (Projet projet : projets) { 		      
	           if(projet.getNom().equals(nomProjet)) {
	        	   stateProjet = true;
	           }
	      }
		
		if (stateProjet == false) {
			try {
				String sql = "INSERT INTO projet(nom) VALUES(?)";
				PreparedStatement ps = connection.prepareStatement(sql);
				
				ps.setString(1,nomProjet);
				boolean rtExecute = ps.execute();
				
				if(rtExecute == false) {
					LOGGER.debug("le projet est inseré");
				}
				
				
				
			} catch (Exception e) {
				System.out.println("exeption insertion de message" + e.getMessage() + " ; " + e.getCause());
			}
		}else {
			LOGGER.debug("pas d'insertion");
		}
		
		

	}

	@Override
	public void update(Projet t, String[] params) {
		// TODO Auto-generated method stub

	}

	
	/**
	 * on ne pourra pas enlever les projet pour l'instant
	 * voir à déplacer les valeurs dans le id 1 qui est sans projet
	 * utilité a voir?
	 */
	@Override
	public String delete(Projet t) {
		String nomProjet = t.getNom();
		String numberId = null;
		try {
			String sql = "DELETE from projet WHERE  nom LIKE '" + nomProjet + "'";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("dans delete : " + t.getNom());
				
			
			
			while (rs.next()) {
				System.out.println(rs.getString("id_projet"));
				numberId = rs.getString("id_projet");
			}
			
			
		} catch (Exception e) {
			LOGGER.debug("delete" + e.getMessage());
			// TODO: handle exception
		}
//		return null;
		
		
//		String sql = "DELETE FROM projet WHERE nom LIKE " + nomProjet; 
//		
//		try {
//			PreparedStatement ps = connection.prepareStatement(sql);
//			ps.execute();
//			
			return numberId;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		

	}

}
