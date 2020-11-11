/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;

/**
 *
 * @author ASUS
 */
public class Player {
    String name;
    int speed;
    int healthpoin;
    
    void run(){
        System.out.println(name + "is running...");
        System.out.println("speed: "+ speed);
        
    }
    boolean isDead(){
        if(healthpoin<=0) return true;
        return false;
    }
}
