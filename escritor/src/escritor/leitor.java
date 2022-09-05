/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritor;

import java.io.*;
import java.util.StringTokenizer;
public class leitor {
    public static void main(String[]args) throws FileNotFoundException{
        
        try{
            FileReader gravador = new FileReader("Arquivo.txt");
            BufferedReader entrada = new BufferedReader(gravador);
            String linha;
            while((linha = entrada.readLine())!=null){
              StringTokenizer tok  = new StringTokenizer(linha,";");
                System.out.println(linha);
                System.out.println("Bebida:"+tok.nextToken());
                System.out.println("Origem: "+tok.nextToken());
                System.out.println("Grau de alcool: "+tok.nextToken());
                System.out.println("----------------------------------");
            }
        }
        catch(IOException e){
            System.out.println("Nao deu pra ler o arquivo");
        }
        
     finally{
             
        }
    }
}
