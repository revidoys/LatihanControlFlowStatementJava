
package pembayaran;

public class Pembayaran {
    public int hitungPembayaran(int nilaiTotalPembelian, double diskon){
        int nilaiYangDibayar = nilaiTotalPembelian;
        if(nilaiYangDibayar >= 5_000_000)
            nilaiYangDibayar = (int) (nilaiTotalPembelian - nilaiTotalPembelian * diskon);
        return nilaiYangDibayar;
        
    }
    
}
