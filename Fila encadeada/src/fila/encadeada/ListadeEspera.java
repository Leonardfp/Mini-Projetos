/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fila.encadeada;


public class ListadeEspera {
    public static void main(String args[]){
        Lista lista = new Lista();
        lista.inserir(35);
        lista.inserir(50);
       
        
      while(!lista.isEmpty()){
          int e = lista.retirar();
          System.out.println("Tirei o elemento "+e);
      }
    }
}
