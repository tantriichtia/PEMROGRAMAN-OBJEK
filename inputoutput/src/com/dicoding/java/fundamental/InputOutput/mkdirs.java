
package com.dicoding.java.fundamental.InputOutput;

import java.io.File;

public class mkdirs {

    public static void main(String[] args) {
        String dirname = "/java/latihan1";
        File file = new File(dirname);
        // Buat directory
        file.mkdirs();
    
    }
    
}
