
package classifier;


public class CustomerPredictor {
    public boolean predict (int umur, int statusPelajar, int tingkatPelunasan){
        
        boolean potensiMenjadiCustomer = true;
        
        if ((umur == 1) || (umur == 0 && statusPelajar == 0) || (umur == 2 && tingkatPelunasan == 0)) {
            
        } else {
            
          potensiMenjadiCustomer = false;  
        }
        
        return potensiMenjadiCustomer;
        
        
    }
}
