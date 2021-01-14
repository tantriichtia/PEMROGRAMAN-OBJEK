/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_OOP.Nomor_2;

/**
 *
 * @author ASUS
 */
public class Persegi  extends SegiTiga {
    
    @Override
    public void HitungLuas() {
        double luas;
        luas = this.sisic * this.sisic;
        System.out.println("Panjang Sisi        : " + this.sisic + " CM");
        System.out.println("Luas Persegi Adalah : " + luas + " CM");
    }
    
    @Override
    public void HitungKeliling() {
        double keliling;
        keliling = this.sisic * 2;
        System.out.println("Panjang Sisi            : " + this.sisic + " CM");
        System.out.println("Keliling Persegi Adalah : " + keliling + " CM");
    }
    
}
