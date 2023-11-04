package controllers;

import play.mvc.With;

@Check("admin")     //hanya admin yg bisa mengakses
@With(Secure.class)     //protecting BukuAlamats
public class BukuAlamats extends CRUD {

}
