/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fila.encadeada;

/**
 *
 * @author Leo
 */
public class FilaEncadeada {
    private int elemento;
    private FilaEncadeada proximo;
    
    public void setElemento(int elemento){
        this.elemento = elemento;
    }
    public int getElemento(FilaEncadeada proximo){
     return this.elemento;   
    }
    public void setProximo(FilaEncadeada proximo){
       this.proximo = proximo;
    }
    public FilaEncadeada getProximo(){
        return this.proximo;
    }
    
}
