/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_OOP.Nomor_1;

/**
 *
 * @author ASUS
 */
public class penerimaanbeasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama = "Tanri Ichtia Ningsih",
                NIM = "201969040026",
                jurusan = "Teknik Informatika",
                smstr = "3",
                kls = "A";
        double PO = 4*4; //jumlah (SKS x Poin)
        double BD = 4*4; //jumlah (SKS x Poin)
        double JK = 5*4; //jumlah (SKS x Poin)
        double IMK = 3*3; //jumlah (SKS x Poin)
        double SP = 3*4; //  jumlah (SKS x Poin)
        double SKS = 19; //jumlah SKS
        double jumlahkumulatif, ipk;
        jumlahkumulatif = PO+BD+JK+IMK+SP;
        ipk = jumlahkumulatif/SKS;
       
        System.out.println("Nama : " + nama );
        System.out.println("NIM : " + NIM);
        System.out.println("jurusan : " + jurusan);
        System.out.println("Kelas : " + smstr + kls);
        System.out.println("Nilai Mk-pemrograman objek : " + PO);
        System.out.println("Nilai MK-basis data : " + BD);
        System.out.println("Nilai MK-Jaringan komputer: " + JK);
        System.out.println("Nilai MK-Interaksi Manusia dan komputer : " + IMK);
        System.out.println("Nilai MK-Statistik probabilitas : " + SP);
        System.out.println("Nilai IPK : " + ipk);
        
        if(ipk >= 3.25) {
            System.out.println("Selamat Anda Mendapat Beasiswa");
        }else if (ipk<3.35) {
            System.out.println("Maaf Anda Tidak Mendapat Beasiswa");
            
        }
    }
        
    } 
        
                
        // TODO code application logic here
    
    

