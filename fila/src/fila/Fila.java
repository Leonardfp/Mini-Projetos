/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fila;

/**
 *
 * @author Leo
 */
public class Fila {
    private int [] valores;
    private int inicio;
    private int fim;
    private int total;
    
    public Fila(){
        valores = new int[10];
        inicio = 0;
        fim = 0;
        total = 0;
    }
    
    public void inserir(int elemento){
    valores [fim] = elemento;
            fim = (fim+1)%10;
            
            
    }
    public int retirar(){
        
    }
    
    public boolean isEmpty(){
     return (total ==0);
    }
    
    public boolean isFull(){
        return (total == 10);
    }
    
    public static void main(String[] args) {
        
        
    }
    
}
