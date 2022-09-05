/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilha;


public class Conversor {
    public static void main(String args[]){
      //empilhamento dos restos
        int numero = Integer.parseInt(args[0]);
        int resto;
        Pilha p = new Pilha();
        while(numero!= 0){
            resto = numero%2;
            p.push(resto);
            numero = numero/2;
        }
        //exibir restos
        
        while(!p.isEmpty()){
            resto=p.pop();
            System.out.println("Resto "+resto);
        }
        System.out.println("\nFim!");
    }
}
