package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;

@Entity
//class BukuAlamat akan terkoneksi dg tabel di db dan akanemmbuat 1 tabel dg nama BukuAlamat dg kolom yg sudah dibuat di sini
public class BukuAlamat extends Model{
	public String nama;
	public String notelp;
	public String alamat;

	@ManyToOne
	public GolonganDarah namagoldar;
	
	@ManyToOne
	public Kabupaten namakabupaten;

	public String toString() {
		return nama;
	}
}