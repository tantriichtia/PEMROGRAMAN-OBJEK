/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicodingfundamental.IfThen;

/**
 *
 * @author ASUS
 */
public class SwitchWithoutBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         char input = 'C';
        int output = 0;
        switch (input) {
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                output++;
            case 'D':
                output++;
            case 'E':
                output++;
                 default:
                output++;
        }
        System.out.println("Nilai akhirnya adalah " + output);
    }
    
}
