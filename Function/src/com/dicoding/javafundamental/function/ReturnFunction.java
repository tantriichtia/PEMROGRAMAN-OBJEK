/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.function;

/**
 *
 * @author ASUS
 */
public class ReturnFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p, l); //memanggil fungsi
        System.out.println("Hasilnya adalah = " + hasil);
    }
    //fungsi dengan nilai balik
    public static double hitungLuas(double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
        // TODO code application logic here
    }
    
}
