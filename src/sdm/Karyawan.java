
package sdm;

public class Karyawan {
    public int hitungGaji(int gajiSebelumPPh, double pph, int ptkp){
        int gajiSetelahPPh = gajiSebelumPPh;
        if(gajiSebelumPPh >= ptkp)
            gajiSetelahPPh = (int) (gajiSebelumPPh - pph * gajiSebelumPPh);
        
        return gajiSetelahPPh;
    }
    
    
    public int hitungPPH(int gajiSebelumPPh, double pph, int ptkp){
        int gajiSetelahPPh = gajiSebelumPPh;
        if(gajiSebelumPPh >= ptkp)
            gajiSetelahPPh = (int) (gajiSebelumPPh - pph * gajiSebelumPPh);
   
        return gajiSetelahPPh;  
    }
   
}
