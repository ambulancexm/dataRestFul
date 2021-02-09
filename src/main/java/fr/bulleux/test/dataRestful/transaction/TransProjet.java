package fr.bulleux.test.dataRestful.transaction;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.bulleux.test.dataRestful.beans.Projet;

@Repository
public class TransProjet {
	

	@Autowired
	private EntityManager entityManager;

	public TransProjet() {
	}

	public Projet findById(Long id) {
		return this.entityManager.find(Projet.class, id);
	}
}
