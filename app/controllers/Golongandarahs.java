package controllers;

import play.mvc.With;

@Check("admin")
@With(Secure.class)     //protecting GolonganDarahs
public class GolonganDarahs extends CRUD{

}
