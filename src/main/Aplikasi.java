
package main;

import pembayaran.Pembayaran;
import sdm.Karyawan;
import billing.Customer;
import expertsystem.Expert;
import alarmsystem.Alarm;
import classifier.IrisClassifier;
import classifier.ColdDetector;

public class Aplikasi {
    public static void main(String[] args) {
        Pembayaran pembayaran = new Pembayaran();
        
        // Latihan 1
        int nilaiYangDibayarkan;
        
        //test case1
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(6000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        
        //test case2
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(4000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        
        //test case3
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(5000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        System.out.println("=====================");
        
        Karyawan Karyawan = new Karyawan();
        
        // Latihan 2
        int gajiSetelahPPH;
        
        //test case 1
        gajiSetelahPPH = Karyawan.hitungGaji(6000000, 0.1, 6000000);
        System.out.println(gajiSetelahPPH);
            
        //test case 2
        gajiSetelahPPH = Karyawan.hitungGaji(4000000, 0.1, 3000000);
        System.out.println(gajiSetelahPPH);
        
        //test case 3
        gajiSetelahPPH = Karyawan.hitungGaji(500000, 0.1, 1000000);
        System.out.println(gajiSetelahPPH);
        System.out.println("=====================");
        
        Karyawan karyawan = new Karyawan();
        
        //Latihan 3
        int hitungPPH;
        
        //test case 1
        gajiSetelahPPH = Karyawan.hitungPPH(6000000, 0.1, 6000000);
        System.out.println(gajiSetelahPPH);
        
        //test case 1
        gajiSetelahPPH = Karyawan.hitungPPH(4000000, 0.1, 3000000);
        System.out.println(gajiSetelahPPH);
        
        //test case 1
        gajiSetelahPPH = Karyawan.hitungPPH(500000, 0.1, 1000000);
        System.out.println(gajiSetelahPPH);
        System.out.println("=====================");
        
        Customer customer = new Customer();
        
        // Latihan 4
        int nilaiTagihanPembayaranSetelahDenda;
        
        
        //test case 1
        nilaiTagihanPembayaranSetelahDenda = customer.hitungPembayaranTagihan(400000, 0.01, 1, 4);
        System.out.println(nilaiTagihanPembayaranSetelahDenda);
        
        //test case 2
        nilaiTagihanPembayaranSetelahDenda = customer.hitungPembayaranTagihan(300000, 0.01, 1, 3);
        System.out.println(nilaiTagihanPembayaranSetelahDenda);
        System.out.println("=====================");
        
        Expert expert = new Expert();
        
        //Latihan 5
        boolean jenisTumpahan;
        
        //test case 1
        jenisTumpahan = expert.isAceticAcid(true, 5, true);
        System.out.println(jenisTumpahan);
        
        //test case 2
        jenisTumpahan = expert.isAceticAcid(true, 6, true);
        System.out.println(jenisTumpahan);
        
        //test case 3
        jenisTumpahan = expert.isAceticAcid(true, 7, true);
        System.out.println(jenisTumpahan);
        
        //test case 4
        jenisTumpahan = expert.isAceticAcid(true, 5, false);
        System.out.println(jenisTumpahan);
        
        //test case 5
        jenisTumpahan = expert.isAceticAcid(true, 6, false);
        System.out.println(jenisTumpahan);
        
        //test case 6
        jenisTumpahan = expert.isAceticAcid(true, 7, false);
        System.out.println(jenisTumpahan);
        
        //test case 7
        jenisTumpahan = expert.isAceticAcid(false, 5, true);
        System.out.println(jenisTumpahan);
        
        //test case 8
        jenisTumpahan = expert.isAceticAcid(false, 6, true);
        System.out.println(jenisTumpahan);
        
        //test case 9
        jenisTumpahan = expert.isAceticAcid(false, 7, true);
        System.out.println(jenisTumpahan);
        System.out.println("=====================");
        
        Alarm alarm = new Alarm();
        
        //Latihan 6
        boolean statusAlarmWarning;
        
        //test case 1
        statusAlarmWarning = alarm.isAlarmStatusWarning(55.5, true, true);
        System.out.println(statusAlarmWarning);
        
        //test case 2
        statusAlarmWarning = alarm.isAlarmStatusWarning(60, true, true);
        System.out.println(statusAlarmWarning);
        
        //test case 3
        statusAlarmWarning = alarm.isAlarmStatusWarning(40, true, true);
        System.out.println(statusAlarmWarning);
        
        //test case 4
        statusAlarmWarning = alarm.isAlarmStatusWarning(55.5, false, true);
        System.out.println(statusAlarmWarning);
        
        //test case 5
        statusAlarmWarning = alarm.isAlarmStatusWarning(60, false, true);
        System.out.println(statusAlarmWarning);
        
        //test case 6
        statusAlarmWarning = alarm.isAlarmStatusWarning(40, false, true);
        System.out.println(statusAlarmWarning);
        
        //test case 7
        statusAlarmWarning = alarm.isAlarmStatusWarning(55.5, false, false);
        System.out.println(statusAlarmWarning);
        
        //test case 8
        statusAlarmWarning = alarm.isAlarmStatusWarning(60, false, false);
        System.out.println(statusAlarmWarning);
        
        //test case 1
        statusAlarmWarning = alarm.isAlarmStatusWarning(40, false, false);
        System.out.println(statusAlarmWarning);
        System.out.println("==================");
        
        IrisClassifier irisClassifier = new IrisClassifier();
        String jenisBunga;
        //panjang sepal, lebar sepal, panjang petal, lebar petal
        //test case 1
        jenisBunga = irisClassifier.predict(4.3, 3.0, 1.1, 0.1);
        System.out.println(jenisBunga);
        //test case 2
        jenisBunga = irisClassifier.predict(4.8, 3.0, 1.4, 0.1);
        System.out.println(jenisBunga);
        //test case 3
        jenisBunga = irisClassifier.predict(5.2, 4.1, 1.5, 0.1);
        System.out.println(jenisBunga);
        //test case 4
        jenisBunga = irisClassifier.predict(4.6, 3.6, 1.0, 0.2);
        System.out.println(jenisBunga);
        //test case 5
        jenisBunga = irisClassifier.predict(5.1, 3.3, 1.7, 0.5);
        System.out.println(jenisBunga);
        //test case 6
        jenisBunga = irisClassifier.predict(5.0, 3.5, 1.6, 0.6);
        System.out.println(jenisBunga);
        //test case 7
        jenisBunga = irisClassifier.predict(5.0, 2.3, 3.3, 1.0);
        System.out.println(jenisBunga);
        //test case 8
        jenisBunga = irisClassifier.predict(4.9, 2.4, 3.3, 1.0);
        System.out.println(jenisBunga);
        //test case 9
        jenisBunga = irisClassifier.predict(5.0, 2.0, 3.5, 1.0);
        System.out.println(jenisBunga);
        //test case 10
        jenisBunga = irisClassifier.predict(6.1, 2.8, 4.0, 1.3);
        System.out.println(jenisBunga);
        //test case 11
        jenisBunga = irisClassifier.predict(5.7, 2.8, 4.1, 1.3);
        System.out.println(jenisBunga);
        //test case 12
        jenisBunga = irisClassifier.predict(5.6, 3.0, 4.1, 1.3);
        System.out.println(jenisBunga);
        //test case 13
        jenisBunga = irisClassifier.predict(6.1, 2.6, 5.6, 1.4);
        System.out.println(jenisBunga);
        //test case 14
        jenisBunga = irisClassifier.predict(6.0, 2.2, 5.0, 1.5);
        System.out.println(jenisBunga);
        //test case 15
        jenisBunga = irisClassifier.predict(6.3, 2.2, 5.0, 1.5);
        System.out.println(jenisBunga);
        //test case 16
        jenisBunga = irisClassifier.predict(7.2, 3.0, 5.8, 1.6);
        System.out.println(jenisBunga);
        //test case 17
        jenisBunga = irisClassifier.predict(4.9, 2.5, 4.5, 1.7);
        System.out.println(jenisBunga);
        //test case 18
        jenisBunga = irisClassifier.predict(6.2, 2.8, 4.8, 1.8);
        System.out.println(jenisBunga);
        System.out.println("=============");
        
        ColdDetector coldDetector = new ColdDetector();
        coldDetector.uji("C:\\aaa\\testcases1.csv");        
        
    
    }
    
}
