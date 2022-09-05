/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escritor;

import java.io.*;


public class Escritor {
     
   
    public static void main(String[] args) throws IOException {
      
       try{
        
            
           FileWriter gravador = new FileWriter("arquivo.txt");
            BufferedWriter saida = new BufferedWriter(gravador);
            saida.write("Vodka;Russia;Forte\n");
            saida.write("Canha;Brasil;Forte\n");
            saida.write("Vinha;Egito;Medio\n");
            saida.write("Cerveja;Sumeria;Fraca");
            saida.flush();
        }
        catch(IOException e){
            System.out.println("Não deu parae escrever o arquivo");
    }
    }
    
}
