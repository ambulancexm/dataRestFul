package fr.bulleux.test.dataRestful.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@RestResource
@Table(name = "PROJET")
public class Projet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDPROJET")
	private Long idProjet;
	private String nom;
	
	public Projet() {
	}

	public Projet(Long idProjet, String nom) {
		super();
		this.idProjet = idProjet;
		this.nom = nom;
	}


	public Long getIdProjet() {
		return idProjet;
	}

	public void setIdProjet(Long idProjet) {
		this.idProjet = idProjet;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "projet [idProjet=" + idProjet + ", nom=" + nom + "]";
	}
	
	

}
