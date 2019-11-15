package Entitas;



import java.text.DecimalFormat;
import java.util.Scanner;


public class tampilan {
    
    public static Scanner sc = new Scanner(System.in);

    public static void tampilanUtama(Login player) {
        separator();
        System.out.println("---------------------");
        System.out.println("+-+-+ Game Math +-+-+");
        System.out.println("---------------------");
        System.out.print("Masukkan Nama Anda : ");

        String in = sc.nextLine();

        if ((in.isEmpty() == true) || (" ".equals(in))) {
            player.setNama("O");
        } else {
            player.setNama(in);
        }

        separator();
    }
    
    public static void tampilanMenu(Login player){
        separator();
        System.out.println("---------------------");
        System.out.println("+-+-+ Game Math +-+-+");
        System.out.println("---------------------");
        System.out.println("");
        System.out.println("Menu :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Keluar");
        System.out.println("");
        System.out.print("Pilih no menu : ");

        switch (sc.nextLine()) {
            case "1":
                Level.penjumlahan(player);
                break;

            case "2":
                Level.pengurangan(player);
                break;
                
            case "3":
                separator();
                separatorLine();
                System.out.println("Anda telah keluar dari Game Math");
                separatorLine();
                break;

            default:
                tampilanMenu(player);
                break;
        }
        separator();
    }


    public static void tampilanPenjumlahan() {
        separator();

        System.out.println("-----------------------");
        System.out.println("Game Math - Penjumlahan");
        System.out.println("-----------------------");
        
        separator();
    }

    public static String tampilanPenjumlahan(int bil1, int bil2) {
        
        DecimalFormat dFormat = new DecimalFormat();
        dFormat.setNegativePrefix("(-");
        dFormat.setNegativeSuffix(")");

        System.out.println("Berapakah hasil dari " + dFormat.format(bil1) + " + " + dFormat.format(bil2) + " ?");
        System.out.print("Jawaban : ");

        String inputJawaban = sc.nextLine();

        return inputJawaban;
    }



    public static void tampilanPengurangan() {
        separator();

        System.out.println("-----------------------");
        System.out.println("Game Math - Pengurangan");
        System.out.println("-----------------------");
        
        separator();
    }

    public static String tampilanPengurangan(int bil1, int bil2) {

        DecimalFormat dFormat = new DecimalFormat();
        dFormat.setNegativePrefix("(-");
        dFormat.setNegativeSuffix(")");

        System.out.println("Berapakah hasil dari " + dFormat.format(bil1) + " - " + dFormat.format(bil2) + " ?");
        System.out.print("Jawaban : ");

        String inputJawaban = sc.nextLine();

        return inputJawaban;
    }
    
    
    
    public static void separatorLine() {
        System.out.println("-----------------------------");
    }
    
    public static void separator() {
        System.out.println("");
    }



    public static void jawaban(String jawab, Login player) {

        switch(jawab){
            
            case "true":
                System.out.println("[Selamat " + player.getNama() + ", ANDA BENAR :) ] [Skor: " + player.getSkor() + "] [Nyawa: " + player.getLive() + "] [Level: " + Level.getLevel() + "]");
                break;
            
            case "false":
                System.out.println("[Jawaban SALAH :( ] [Skor: " + player.getSkor() + "] [Nyawa: " + player.getLive() + "] [Level: " + Level.getLevel() + "]");
                break;
            }

        separator();
        separatorLine();
        separator();
    }

    public static void tampilanNyawaHabis(Login player) {
        System.out.println("[Hai " + player.getNama() + ", Nyawa habis :( . Jangan menyerah ya untuk mencoba lagi :) ]");
        System.out.println("Tekan ENTER untuk kembali ke Menu.");
        separator();
        separatorLine();
    }
    
    public static void tampilanBerhasilPenjumlahan(Login player) {
        System.out.println("[Selamat " + player.getNama() + ", Anda telah menyelesaikan soal penjumlahan dengan baik. Silakan dicoba soal pengurangannya ya]");
        System.out.println("Tekan ENTER untuk kembali ke Menu.");
        separator();
        separatorLine();
    }

    public static void tampilanBerhasilPengurangan(Login player) {
        System.out.println("[Selamat " + player.getNama() + ", Anda telah menyelesaikan soal pengurangan dengan baik. Silakan dicoba soal penjumlahannya ya]");
        System.out.println("Tekan ENTER untuk kembali ke Menu.");
        separator();
        separatorLine();
    }

}