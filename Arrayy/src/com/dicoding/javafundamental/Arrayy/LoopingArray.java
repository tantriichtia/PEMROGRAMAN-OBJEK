
package com.dicoding.javafundamental.Arrayy;

public class LoopingArray {

    public static void main(String[] args) {
        int[] arrInt = new int[1000000];

        // Inisiasi dan menampilkan arrInt dari elemen 1 sampai 1000000
        for (int x = 0; x < arrInt.length; x++) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }
    
}
