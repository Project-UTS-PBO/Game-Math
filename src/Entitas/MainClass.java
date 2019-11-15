
import program.Login;
import Tampil.tampilan;
import java.util.Scanner;

public class MainClass {

    // Main class.
    public static void main(String[] args) {

        // Buat objek baru dan instansiasi nilai awal.
        Login player = new Login();
        

        // Masuk ke tampilan utama untuk input nama.
        // Parameter pertama 'player' untuk passing objek 'player'.
        tampilan.tampilanUtama(player);


        // Masuk ke menu Utama.
        // Masuk ke tampilan Menu.
        tampilan.tampilanMenu(player);
       


   }

}

    
