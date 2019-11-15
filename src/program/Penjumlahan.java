package program;

import Tampil.tampilan;
import java.util.Scanner;

public class Penjumlahan extends Level {
    
    // Atribut.
    static int inputJawaban;
    static int jawabanBenarnya;
    public static Scanner sc = new Scanner(System.in);

    // Level Penjumlahan.
    public static void soalPenjumlahan(Login player){
  
        player.setLive(3);
        player.setSkor(0);

        // Masuk ke tampilan Menu Penjumlahan.
        tampilan.tampilanPenjumlahan();
        

        // Selama skor masih dibawah 300 dan nyawa masih diatas 0, maka perintah di dalam bracket while di bawah ini akan dieksekusi terus menerus.
        while((player.getSkor() < 300) && (player.getLive() > 0) ) {
        
            // Set bilangan pertama dan kedua secara random sesuai skor player.
            if (player.getSkor() <= 100) {
                Penjumlahan.setBil1(Penjumlahan.randomNumber(0, 10));
                Penjumlahan.setBil2(Penjumlahan.randomNumber(0, 10));
            }

            else if ((player.getSkor() >= 101) && (player.getSkor() <= 200)) {
                Penjumlahan.setBil1(Penjumlahan.randomNumber(-10, -1));
                Penjumlahan.setBil2(Penjumlahan.randomNumber(-10, -1));
            }

            else if ((player.getSkor() >= 201) && (player.getSkor() <= 300)) {
                Penjumlahan.setBil1(Penjumlahan.randomNumber(-10, 10));
                Penjumlahan.setBil2(Penjumlahan.randomNumber(-10, 10));
            }
            
            
            // Cek apakah yang diinputkan user sudah valid?
            while (true) {
                try {
                    
                    // Print pertanyaan dengan memanggil method non-void 'tampilanPenjumlahan'
                    // kemudian mengembalikan return berupa inputan player lalu menyimpannya dalam
                    // variabel 'inputJawaban' Karna inputan awal masih berupa string. maka di convert
                    // terlebih dahulu menjadi Integer.
                    inputJawaban = Integer.parseInt(tampilan.tampilanPenjumlahan(Penjumlahan.getBil1(), Penjumlahan.getBil2()));

                    // Hentikan pengecekan dan lanjutkan program.
                    break;
                  
                // Jika inputan yang dimasukkan player tidak valid,
                // Misal berupa String, maka...
                } catch (NumberFormatException e) {

                    // Tidak melakukan apa-apa atau kembali lagi ke pengecekan karna
                    // masih dalam while loop.

                }
            }
            
            // Cek jawaban yang benar dan memasukkannya ke dalam variabel.
            jawabanBenarnya = Penjumlahan.getBil1() + Penjumlahan.getBil2();

            // Jika inputan user sama dengan jawabanBenarnya, maka...
            if (inputJawaban == jawabanBenarnya) {
                player.setSkor(player.getSkor() + 4);
                tampilan.separator();
                Level.setLevel(player.getSkor());
                tampilan.jawaban("true", player);

            // Jika inputan user tidak sama dengan jawabanBenarnya, maka...
            } else {
                player.setSkor(player.getSkor() - 1);
                player.setLive(player.getLive() - 1);
                tampilan.separator();
                Level.setLevel(player.getSkor());
                tampilan.jawaban("false", player);
            }  
        }
        if (player.getLive() <= 0) {
            tampilan.tampilanNyawaHabis(player);
            sc.nextLine();
            
            tampilan.tampilanMenu(player);
        } else {
            tampilan.tampilanBerhasilPenjumlahan(player);
            sc.nextLine();
            
            tampilan.tampilanMenu(player);
        }
    }

  
}