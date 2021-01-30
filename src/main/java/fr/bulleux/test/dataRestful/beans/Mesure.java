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
@Table(name = "MESURE")
public class Mesure {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDMESURE")
	private Long idMesure;
	private String nomMesure;
	private String uniteMesure;
	
	public Mesure() {
		super();
	}
	
	public Mesure(Long idMesure, String nomMesure, String uniteMesure) {
		super();
		this.idMesure = idMesure;
		this.nomMesure = nomMesure;
		this.uniteMesure = uniteMesure;
	}
	
	public Long getIdMesure() {
		return idMesure;
	}
	public void setIdMesure(Long idMesure) {
		this.idMesure = idMesure;
	}
	public String getNomMesure() {
		return nomMesure;
	}
	public void setNomMesure(String nomMesure) {
		this.nomMesure = nomMesure;
	}
	public String getUniteMesure() {
		return uniteMesure;
	}
	public void setUniteMesure(String uniteMesure) {
		this.uniteMesure = uniteMesure;
	}

	@Override
	public String toString() {
		return "mesure [idMesure=" + idMesure + ", nomMesure=" + nomMesure + ", uniteMesure=" + uniteMesure + "]";
	}
	
	
	
}
