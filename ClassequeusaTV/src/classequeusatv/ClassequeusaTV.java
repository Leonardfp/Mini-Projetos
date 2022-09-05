/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classequeusatv;

/**
 *
 * @author Leo
 */
public class ClassequeusaTV {

    
    public static void main(String[] args) {
      Televisao t = new Televisao();
      t.defineMarca("Samsung");
      t.ligar();
      t.defineVolume(10);
      t.defineCanal(4);
      t.aumentaVolume();
      t.desligar();
      
    }
    
}
