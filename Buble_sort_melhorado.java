
import java.util.*;

public class Buble_sort_melhorado {

    public static void main(String[] args) {
        int x[] = new int[5];
        int j, i, aux;
        Scanner entrar = new Scanner(System.in);
        for(i=0;i<4;i++){
            System.out.println("Digite o "+(i+1)+" Numero: ");
            x[i] = entrar.nextInt();
        }
        //ordenar crescente
        for(j=1;j<=4;j++){
            //percorre ultima posição
            for(i=4;i>=j;i--){
                if(x[i] < x[i-1]){
                    aux = x[i];
                    x[i] = x[i-1];
                    x[i-1] = aux;
                }
            }
        }
        for(i = 0;i<=4;i++){
            System.out.println((i+1)+"Numeros "+x[i]);
        }
    }

}
