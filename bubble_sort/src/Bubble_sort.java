import java.util.*;



public class Bubble_sort {

  
    public static void main(String[] args) {
       int x[] = new int[5];
       int n,i,aux;
       Scanner entrar = new Scanner(System.in);
     
       for(i=0;i<=4;i++){
              System.out.println("Digite 5 numero aleatorios");
         x[i] = entrar.nextInt();
       }
           //forma crescente
           for(n=1; n<=5;n++){
               for(i = 0;i<=3;i++){
                   if(x[i] > x[i+1]){
                       aux = x[i];
                       x[i] = x[i+1];
                       x[i+1]= aux;
                   }
               }
           }
           for(i=0;i<=4;i++){
               System.out.println((i+1)+" Numero "+x[i]);
           }
       
    }
    
}
