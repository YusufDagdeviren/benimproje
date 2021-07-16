
public class EsitAgirlik extends Ogrenci {
/*
    private int edebiyat;
    private int matematik;
    private int turkce;
    private int fen;
    private int sosyal;
    */
    
    
    public EsitAgirlik() {
        
        super();
        
    }

    @Override
    public int puanhesapla() {
        
        return (getEdebiyat()*5 + getMatematik()*5 + getTurkce()*4 + getFen()*1+getSosyal()*3);
        
    }

   
    
    
    
    
    
    
}
