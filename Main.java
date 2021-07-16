
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        String islemler = "1.Eşit ağırlık öğrencilerini hesapla\n"
                + "2.Sayısal öğrencileri hesapla\n"
                + "Çıkış:q";
        
        while(true){
            System.out.println("**************************");
            System.out.println(islemler);
            System.out.println("**************************");
            System.out.println("Lütfen bir seçim yapınız: ");
            String secim = oku.nextLine();
            if(secim.equals("q")){
                System.out.println("Sistemden çıkılıyor");
                break;
                
            }
            else if(secim.equals("1")){
                
                EsitAgirlik esit1 = new EsitAgirlik();
                EsitAgirlik esit2 = new EsitAgirlik();
                EsitAgirlik esit3 = new EsitAgirlik();
                
                Ogrenci ogrenci =puango(esit1, esit2, esit3);
                System.out.println("1. ogrencinin ismi: "+ogrenci.getIsim());
                System.out.println("Ogrencinin puanı: "+ogrenci.puanhesapla());
                
            }
            else if(secim.equals("2")){
                
                Sayisal sayisal1 = new Sayisal();
                Sayisal sayisal2 = new Sayisal();
                Sayisal sayisal3 = new Sayisal();
                
                Ogrenci ogrenci =puango(sayisal1, sayisal2, sayisal3);
                System.out.println("1. ogrencinin ismi: "+ogrenci.getIsim());
                System.out.println("Ogrencinin puanı: "+ogrenci.puanhesapla());
                
            }
            else{
                
                System.out.println("Lütfen doğru işlemi seçiniz....");
                
            }
            
            
        }
        
       
        
        
        
    }
    public static <E extends Ogrenci> E puango(E e1,E e2,E e3){
        
        if(e1.puanhesapla()>e2.puanhesapla() && e1.puanhesapla()>e3.puanhesapla()){
            
            return e1;
            
            
        }
        else if(e2.puanhesapla()>e1.puanhesapla() && e2.puanhesapla()>e3.puanhesapla()){
            
            return e2;
            
            
        }
        else if(e3.puanhesapla()>e1.puanhesapla() && e3.puanhesapla()>e2.puanhesapla()){
            
            return e3;
            
            
        }
        
        else{
            return e1;
            
        }
        
        
    }
    
    
}
