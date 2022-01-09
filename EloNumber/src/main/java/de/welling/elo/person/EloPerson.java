package de.welling.elo.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EloPerson {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String lastname;
	private String name;
	private Long eloPoints;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEloPoints() {
		return eloPoints;
	}

	public void setEloPoints(Long eloPoints) {
		this.eloPoints = eloPoints;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
