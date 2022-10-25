import java.util.*;
public class Bubble_sort_melhorado2 {
    
    public static void main(String[] args) {
        Scanner entrar = new Scanner(System.in);
        int x[]= new int[5];
        int n,i,aux,troca;
        for(i = 0;i<=4;i++){
            System.out.println("Digite o "+(i+1)+" ");
            x[i] = entrar.nextInt();
        }
        //forma crescente 
        n=1;
        troca = 1;
        while(n<=5 && troca == 1){
            troca =0;
            for(i=0;i<=3;i++){
                if(x[i] < x[i+1]){
                    troca = 1;
                    aux = x[i];
                    x[i] = x[i+1];
                    x[i+1] = aux;
                }
            }
            n=n+1;
        }
        for(i = 0;i<=4;i++){
            System.out.println((i+1)+" Numero "+x[i]);
        }
    }
}
