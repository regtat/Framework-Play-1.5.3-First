package models;

import javax.persistence.Entity;
@Entity
public class User extends play.db.jpa.Model {
    public String username;
    public String password;
    
}
