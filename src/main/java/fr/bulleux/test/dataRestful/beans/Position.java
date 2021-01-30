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
@Table(name = "POSITION")
public class Position {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDPOSITION")
	private Long idPosition;
	private String ville;
	private String lieudit;
	private String piece;
	
	public Position() {
		super();
	}

	public Position(Long idPosition, String ville, String lieudit, String piece) {
		super();
		this.idPosition = idPosition;
		this.ville = ville;
		this.lieudit = lieudit;
		this.piece = piece;
	}

	public Long getIdPosition() {
		return idPosition;
	}

	public void setIdPosition(Long idPosition) {
		this.idPosition = idPosition;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getLieudit() {
		return lieudit;
	}

	public void setLieudit(String lieudit) {
		this.lieudit = lieudit;
	}

	public String getPiece() {
		return piece;
	}

	public void setPiece(String piece) {
		this.piece = piece;
	}

	@Override
	public String toString() {
		return "Position [idPosition=" + idPosition + ", ville=" + ville + ", lieudit=" + lieudit + ", piece=" + piece
				+ "]";
	}
	

}
