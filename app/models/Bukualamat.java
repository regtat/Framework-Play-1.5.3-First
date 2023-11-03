package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import models.Golongandarah;

@Entity

//class Bukualamat akan terkoneksi dg tabel di db dan akanemmbuat 1 tabel dg nama BukuAlamat dg kolom yg sudah dibuat di sini
public class Bukualamat extends play.db.jpa.Model{
	public String nama;
	public String notelp;
	public String alamat;
	@ManyToOne
	public Golongandarah namagoldar;
	
	public String ToString() {
		return nama;
		
	}
}
