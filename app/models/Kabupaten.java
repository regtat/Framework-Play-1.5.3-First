package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity

public class Kabupaten extends Model{
    public String namakabupaten;

    public String ToString(){
        return this.namakabupaten;
    }
}
