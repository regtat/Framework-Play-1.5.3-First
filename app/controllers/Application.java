package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.Bukualamat;

@With(Secure.class)

public class Application extends Controller {

    public static void index() {
        render();
    }		//newMahasiswa = tambah data
    public static void BukuAlamat() {	//menampilkan halaman utk pengisian data buku alamat
    	render(); //merender ke suatu halaman BukuAlamat
    	//render= mengirim objek/parameter/variabel ke halaman BukuAlamat
    }
    public static void buatBaru(Bukualamat objbk) {
    	objbk.nama=objbk.nama;
    	objbk.notelp=objbk.notelp;
    	objbk.alamat=objbk.alamat;
    	render(objbk);
    	//menerima masukan 
    }
    public static void tampilkan() {
    List daftar=Bukualamat.findAll();
    //daftar = obj dari suatu list, daftar akan berisi list dari buku alamat
    render(daftar);
    }
    public static void insert() {
    	render();
    }
    public static  void  simpan(Bukualamat bukualamatku){
        bukualamatku.save();
        tampilkan();

    }
    public static void edit(Long id){
        Bukualamat alamatbaru=Bukualamat.find("id=?1", id).first();
        render(alamatbaru);
    }
}