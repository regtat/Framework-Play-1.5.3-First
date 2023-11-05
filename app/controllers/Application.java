package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller{

    public static void index() {
        render();
    }		//newMahasiswa = tambah data

    public static void home(){
        String username = Security.session.get("username");
        User user = User.find("username=?1", username).first();

        if(user==null){
            String name="";
            render(name);
        }else{
            String name=" "+user.fullname;
            render(name);
        }
    }
/*
    public static void BukuAlamat() {	//menampilkan halaman utk pengisian data buku alamat
    	render(); //merender ke suatu halaman BukuAlamat
    	//render= mengirim objek/parameter/variabel ke halaman BukuAlamat
    }
*/
    public static void buatBaru(BukuAlamat objbk) {
    	objbk.nama=objbk.nama;
    	objbk.notelp=objbk.notelp;
    	objbk.alamat=objbk.alamat;
    	render(objbk);
    	//menerima masukan
    }

/*  public static void viewBukuAlamat() {
    List daftar=Bukualamat.findAll();
    //daftar = obj dari suatu list, daftar akan berisi list dari buku alamat
    render(daftar);
    }

    public static void insert() {
    	render();

    }
    public static  void  simpan(BukuAlamat bukualamatku){
        BukuAlamat.save();
        tampilkan();

    }
    public static void edit(Long id){
        Bukualamat alamatbaru=BukuAlamat.find("id=?1", id).first();
        render(alamatbaru);
    }
*/
    public static void signup(){
        render();
    }

    public static void signedup(User user){
        user.save();
        buku_alamat.index();
    }
}