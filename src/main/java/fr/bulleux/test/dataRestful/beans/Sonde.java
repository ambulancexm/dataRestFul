package fr.bulleux.test.dataRestful.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@RestResource
@Table(name = "SONDE")
public class Sonde {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDSONDE")
	private Long idSonde;

	private double valeur;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Iot iot;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Mesure mesure;
	
	public Sonde() {
		super();
	}
	
	public Long getIdSonde() {
		return idSonde;
	}

	public void setIdSonde(Long idSonde) {
		this.idSonde = idSonde;
	}

	public double getValeur() {
		return valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	public Iot getIot() {
		return iot;
	}

	public void setIot(Iot iot) {
		this.iot = iot;
	}

	public Mesure getMesure() {
		return mesure;
	}

	public void setMesure(Mesure mesure) {
		this.mesure = mesure;
	}

	
	
	
}
