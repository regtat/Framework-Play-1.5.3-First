package controllers;

import play.mvc.With;

@Check("admin")
@With(Secure.class)    //protecting Kabupatens
public class Kabupatens extends CRUD{
    
}
