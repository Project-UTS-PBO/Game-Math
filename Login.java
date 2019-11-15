package program;

public class Login {
    
    
    // Attribut Login
    private String nama;
    private int skor;
    private int live;
    
    // Konstruktor Login
    public Login() {
        nama = "O";
        skor = 0;
        live = 3;
    }
    
    // Method Setter dan Getter.
    public void setNama(String inputNama){
        nama = inputNama;
    }
    
    public String getNama(){
        return nama;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }
}
