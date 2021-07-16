
import java.util.Scanner;


public abstract class Ogrenci {
    
    private String isim;
    private int edebiyat;
    private int matematik;
    private int turkce;
    private int fen;
    private int sosyal;

    public Ogrenci() {
       
        Scanner oku = new Scanner(System.in);
        System.out.println("Lütfen Ogrencinizin ismini giriniz: ");
        this.isim = oku.nextLine();
        System.out.println("Lutfen ogrencinizin edebiyat netini giriniz:");
        this.edebiyat = oku.nextInt();
        System.out.println("Lutfen ogrencinizin matematik netini giriniz:");
        this.matematik = oku.nextInt();
        System.out.println("Lutfen ogrencinizin turkce netini giriniz:");
        this.turkce = oku.nextInt();
        System.out.println("Lutfen ogrencinizin fen netini giriniz:");
        this.fen = oku.nextInt();
        System.out.println("Lutfen ogrencinizin sosyal netini giriniz:");
        this.sosyal = oku.nextInt();
        oku.nextLine();

        
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getFen() {
        return fen;
    }

    public void setFen(int fen) {
        this.fen = fen;
    }

    public int getSosyal() {
        return sosyal;
    }

    public void setSosyal(int sosyal) {
        this.sosyal = sosyal;
    }
    
    public abstract int puanhesapla();
    
    
    
    
    
    
    
    
    
    
}
