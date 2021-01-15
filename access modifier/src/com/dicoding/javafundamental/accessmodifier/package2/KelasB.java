/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.accessmodifier.package2;

import com.dicoding.javafundamental.accessmodifier.package1.KelasA;

/**
 *
 * @author ASUS
 */
public class KelasB  extends KelasA {
    
     @Override
    protected void methodC() {
        super.methodC();

        System.out.println("Contoh pemanggilan protected dari package luar");
    }
    
}
