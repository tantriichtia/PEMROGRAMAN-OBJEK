/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.obyek;

/**
 *
 * @author ASUS
 */
public class Main {

   
    public static void main(String[] args) {
           Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");

         Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();
        
          Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
         // menciptakan object dengan nama 'obyekHewan'
       
        // TODO code application logic here
    }
    
}
