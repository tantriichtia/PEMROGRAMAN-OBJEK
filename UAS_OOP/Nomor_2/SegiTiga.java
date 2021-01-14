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
public class SegiTiga extends BangunDatar {
    
     private double sisia = 4;
    protected double sisib = 2;
    protected double sisic = 6;
    protected double jarijari = 26;
    
    @Override
    public void HitungLuas() {
        double luas;
        luas = this.sisib * this.sisic / 2;
        System.out.println("Alas                 : " + this.sisib + " CM");
        System.out.println("Tinggi               : " + this.sisic + " CM" );
        System.out.println("Luas Segitiga Adalah : " + luas + " CM");
    }
    
    @Override
    public void HitungKeliling() {
        double keliling;
        keliling = this.sisia + this.sisib + this.sisic;
        System.out.println("Sisi A                   : " + this.sisia + " CM");
        System.out.println("Sisi B                   : " + this.sisib + " CM");
        System.out.println("Sisi C                   : " + this.sisic + " CM");
        System.out.println("Keliling Segitiga Adalah : " + keliling + " CM");
    }
    
}
