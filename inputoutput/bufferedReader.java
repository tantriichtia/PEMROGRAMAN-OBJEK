/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicodingfundmental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class bufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       InputStreamReader streamReader = new InputStreamReader (System.in);
       BufferedReader bufferedReader = new BufferedReader (streamReader);
        System.out.println("Program penjumlahan sangat sederhana");
        int value = 0;
        int anotherValue = 0;
        try {
            System.out.println("Masukan Angka pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Masukan Angka kedua : ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
            
        }catch (IOException e){
            e.printStackTrace();
        }
        int resul = value + anotherValue;
        System.out.println("Hasilnya adalah :" + resul);
        
    }
    
}
