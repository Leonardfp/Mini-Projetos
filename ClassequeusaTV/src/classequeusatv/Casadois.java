/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classequeusatv;

/**
 *
 * @author Leo
 */
public class Casadois {
    public static void main(String args[]){
        Televisao t1,t2;
        
        t1 = new Televisao();
        t2 = new Televisao();
        
        t1.defineMarca("Sansumg cozinha");
        t2.defineMarca("Sansumg sala");
        
        
        t1.ligar();
        t2.ligar();
        
        t1.defineCanal(96);
        t1.defineVolume(35);
        
        t1.defineCanal(25);
        t2.defineCanal(35);
        t2.defineVolume(85);
        
        
        t1.desligar();
        t2.desligar();
    }
}
