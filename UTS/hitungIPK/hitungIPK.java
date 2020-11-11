/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungIPK;

/**
 *
 * @author ASUS
 */
public class hitungIPK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama = "Tantri Ichtia Ningsih",
                NIM = "201969040026",
                Jurusan = "Teknik Informatika",
                Smstr = "3",
                kls = "A";
         int OOP = 70;
         int BS = 85;
         int JK = 80;
         int IP,totalnilaimk;
         totalnilaimk = OOP + BS + JK;
         IP = totalnilaimk/3;
         
         System.out.println("Nama : " + nama );
         System.out.println("NIM : " + NIM);
         System.out.println("Jurusan : " + Jurusan);
         System.out.println("Kelas : " + Smstr+kls);
         System.out.println("Nilai Total Mata Kuliah : " + totalnilaimk);
         System.out.println("Nilai IP : " + IP);
         
         char Predikat;
         if(IP >=81) {
             Predikat = 'A';
         }else if (IP>=61){
             Predikat ='B';
         }else if (IP>=60){
             Predikat = 'C';
         }else
             Predikat = 'D';
         System.out.println("Selamat Anda Mendapatkan Predikat" + Predikat);
         }
                        
        // TODO code application logic here
    }
    

