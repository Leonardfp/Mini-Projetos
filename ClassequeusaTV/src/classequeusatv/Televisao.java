/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classequeusatv;

/**
 *
 * @author Leo
 */
public class Televisao {
    String marca;
    boolean ligado;
    int volume;
    int canal;
    
    public Televisao(){
    ligado = false;
}
    public void ligar(){
    ligado = true;
        System.out.println("TV "+marca+" ligada");
    }
    public void desligar(){
        System.out.println("Desligando a TV "+marca);
        ligado = false;
    }
    
    public void defineMarca(String nomeMarca){
        marca = nomeMarca;
        System.out.println("TV - Marca definida: "+marca);
    }
    public void defineVolume(int vol){
        if(ligado){
            volume = vol;
            System.out.println("TV"+marca +"Volume definido para "+volume);
    }
        else{
            System.out.println("Ligue a TV antes");
        }
}
    public void defineCanal(int ca){
        if(ligado){
            canal = ca;
            System.out.println("TV"+marca+"com canal definido para "+canal);
        }
        else{
            System.out.println("ligue a tv antes");
        }
    }
    public void aumentaVolume(){
       volume++;
        System.out.println("TV"+marca+" Volume atual "+volume);
    }
}

