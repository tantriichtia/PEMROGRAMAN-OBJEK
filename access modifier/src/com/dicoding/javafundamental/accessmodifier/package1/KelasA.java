/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.accessmodifier.package1;

/**
 *
 * @author ASUS
 */
public class KelasA {
    
     private int memberA = 5;

    char memberB = 'A';
    double memberC = 1.5;

    private int functionA() {
        return memberA;
    }

    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }
    
        protected void methodC(){
        System.out.println("Percobaan access modifier!!!");
    }
    
}
