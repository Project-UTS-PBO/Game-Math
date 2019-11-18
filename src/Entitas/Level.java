package Entitas;


public class Level {
    
    // Atribut.
    private static int bil1;
    private static int bil2;
    private static int level;


    public static void penjumlahan(Login player) {
        Penjumlahan.soalPenjumlahan(player);
    }

    public static void pengurangan(Login player) {
        Pengurangan.soalPengurangan(player);
    }

    // Method random number generator.
    public static int randomNumber(int min, int max) {

        if (min >= max) {
			throw new IllegalArgumentException("Max harus lebih besar dari Min");
		}

		return (int)(Math.random() * ((max - min) + 1)) + min;

    }

    public static int getBil1() {
        return bil1;
    }

    public static void setBil1(int inBil1) {
        bil1 = inBil1;
    }

    public static int getBil2() {
        return bil2;
    }

    public static void setBil2(int inBil2) {
        bil2 = inBil2;
    }

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int skor) {
        if (skor <= 100) {
            Level.level = 1;
        }
        
        else if ((skor >= 101) && (skor <= 200)) {
            Level.level = 2;
        }

        else if ((skor >= 201) && (skor <= 300)) {
            Level.level = 3;
        }
    }
    
}
