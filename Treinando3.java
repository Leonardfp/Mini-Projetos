/*
Desenvolvedor Leo Treinando
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Treinando3 {

    public static void main(String args[]) {
        Scanner receba = new Scanner(System.in);
        int aux, auxiliarcontador = 1;
        double aux2;
        int contador = 0;

        int ReceberContas;
        while (contador < 1) {
            System.out.println("------Painel de escolhas-------");
            System.out.println("** 1 - Para Soma **");
            System.out.println("** 2 - Para Subtrair **");
            System.out.println("** 3 - Para Multiplicador **");
            System.out.println("** 4 - Para Divisor **");
            System.out.println("** 5 - Para Porcentagem **");
            System.out.println("** 6 - Resto de Divisor **");
            System.out.println("*** ------------------------ ***");
            System.out.print("Digite qual deseja: ");
            ReceberContas = receba.nextInt();
            switch (ReceberContas) {
                case 1:
                    System.out.print("Digite o numero para a soma: ");
                    int recebi = receba.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    int recebi2 = receba.nextInt();
                    aux = recebi + recebi2;
                    System.out.println("O Resultado: " + aux);
                    System.out.println("---- Reiniciando o programa ----");
                    break;
                case 2:
                    System.out.print("Digite o numero: ");
                    double subtrair = receba.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    double subtrair2 = receba.nextDouble();
                    aux2 = subtrair - subtrair2;
                    System.out.println("O resultado sera: " + aux2);
                    System.out.println("---- Reiniciando o programa ----");
                    break;
                case 3:
                    System.out.print("Digite o numero: ");
                    double multi = receba.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    double multi2 = receba.nextDouble();
                    aux2 = multi * multi2;
                    System.out.println("O resultado sera: " + aux2);
                    System.out.println("---- Reiniciando o programa ----");
                    break;
                case 4:
                    System.out.print("Digite o numero: ");
                    double divide = receba.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    double divide2 = receba.nextDouble();
                    aux2 = divide / divide2;
                    System.out.println("O resultado sera: " + aux2);
                    System.out.println("---- Reiniciando o programa ----");
                case 5:
                    System.out.print("Digite o numero: ");
                    double porcen = receba.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    double porcen2 = receba.nextDouble();
                    aux2 = (porcen + porcen2) / 100;
                    System.out.println("O resultado sera: " + aux2);
                    System.out.println("---- Reiniciando o programa ----");
                    break;
                case 6:
                    System.out.print("Digite o numero: ");
                    double resto = receba.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    double resto2 = receba.nextDouble();
                    System.out.print("Digite qual resto ira querer que sera: ");
                    double resto3 = receba.nextDouble();
                    aux2 = (resto + resto2) % resto3;
                    System.out.println("O resultado sera: " + aux2);
                    System.out.println("---- Reiniciando o programa ----");
                    break;
                default:
                    System.out.println("ERRO 6963");
                    System.out.println("---- Reiniciando o programa ----");

            }

            System.out.println("** Desenha Parar? **");
            System.out.println("**** Digite 0 para encerrar e 1 para continuar ****");
            auxiliarcontador = receba.nextInt();
            if (auxiliarcontador == 0) {
                contador += 1;
                System.out.println("---- Finalizando o programa ----");
            }
        }

    }

}
