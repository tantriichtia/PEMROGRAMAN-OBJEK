
package com.dicoding.javafundamental.basik;

import com.dicoding.javafundamental.basic.kendaraan.kereta;
import com.dicoding.javafundamental.basic.kendaraan.mobil;
import com.dicoding.javafundamental.basic.kendaraan.motor;
import com.dicoding.javafundamental.basic.musik.Gitar;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

public class Main {
    private static Object mereta;

    public static void main(String[] args) {
        System.out.println("Hello world");
        
        Gitar.bunyi();
        mobil.jumlahBan();
        motor.jumlahBan();
        kereta.jumlahBan();
        
        Date today = new Date ();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);
    }
    
}
