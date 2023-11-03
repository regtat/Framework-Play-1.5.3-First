package models;

import javax.persistence.Entity;

@Entity

public class Golongandarah extends play.db.jpa.Model {
	public String namagoldar;
	
	public String toString() {
		return this.namagoldar;
	}
}
