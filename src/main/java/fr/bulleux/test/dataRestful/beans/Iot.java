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
@Table(name = "IOT")
public class Iot {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDIOT")
	private Long idIot;

	@Column(name = "MAC")
	private String mac;

	@ManyToOne(cascade = CascadeType.ALL)
	private Projet projet;

	@ManyToOne(cascade = CascadeType.ALL)
	private Position position;

	public Iot() {
	}

	public Long getIdIot() {
		return idIot;
	}

	public void setIdIot(Long idIot) {
		this.idIot = idIot;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
