
public class Sayisal extends Ogrenci{

    public Sayisal() {
        super();
    }

    @Override
    public int puanhesapla() {
        return (getEdebiyat()*1 + getMatematik()*5 + getTurkce()*4 + getFen()*5+getSosyal()*2);
        
        
    }
    
    
    
    
    
    
    
}
