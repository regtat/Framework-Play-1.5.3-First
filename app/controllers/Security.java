package controllers;

import models.Bukualamat;
import models.User;

public class Security extends  controllers.Secure.Security{
    //mengeluarkan nilai boolean = authenticate
    static boolean authenticate(String username, String password){
        boolean boleh=false;
        /*ini ada file User.java, udah bikin setaunya. 
        Harusnya Bukualamat (menit 4.01)
        atau buat login, ini ngecek user pass sesuai ga, kalo sesuai tar bisa ngakses
        kemungkinan ini buat login? di menit 6.02 ada group tipenya kek jenis kelamin/goldar, isinya pilihan admin dan guest*/
        User x = User.find("userx=? and passwordx=?", username, password).first();
        //userx passwordx tu apa?
        if(x!=null){
            boleh=true;
        }
        return boleh;
        //kalo ga, yg di app/controllers/Application.java (@With(Secure.class)) itu dihapus. jd gada login" gitu keknya(?)
    }
}
