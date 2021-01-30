package fr.bulleux.test.dataRestful;

import java.sql.Date;
import java.sql.Timestamp;

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
@Table(name="SENSORTEST")
public class Sensor {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="IDSENSOR")
	private Integer id_sensor;
	
	@Column(name = "PROJET", length = 50 )
	private String projet;
	
	@Column(name = "LINE")
	private Integer line;
	
	@Column(name = "MAC", length = 50)
	private String mac;
	
	@Column(name = "NAME", length = 50)
	private String name;
	
	@Column(name = "VAL")
	private Double val;
	
	@Column(name = "DATE")
	private Date date;
	
	@Column(name = "TIME")
	private Timestamp time;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee employee;
	
	
	public Integer getId_sensor() {
		return id_sensor;
	}
	public void setId_sensor(Integer id_sensor) {
		this.id_sensor = id_sensor;
	}
	public String getProjet() {
		return projet;
	}
	public void setProjet(String projet) {
		this.projet = projet;
	}
	public Integer getLine() {
		return line;
	}
	public void setLine(Integer line) {
		this.line = line;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getVal() {
		return val;
	}
	public void setVal(Double val) {
		this.val = val;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
