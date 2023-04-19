package Banco;

import java.util.Scanner;

// Creator Leonardo Oficial Gay Internation
public class Saldo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String encerrar;
        int aux = 0;
        double Valor_deposito;
        final double taxa_saque = 5;

        Object[] matriz = new Object[3];
        for (int i = 0; aux < 1; i++) {

            print("Digite o nome do titular da conta");
            matriz[i++] = entrada.nextLine();
            print("numero da conta");
            final int numero = entrada.nextInt();
            matriz[i++] = numero;
            print("Qual valor do deposito");
            Valor_deposito = entrada.nextDouble();
            if (Valor_deposito == 0) {
                Valor_deposito = 0;
            }
            matriz[i++] = Valor_deposito;
            entrada.nextLine();
            print("Deseja encerrar o programa? Y/N");
            encerrar = entrada.nextLine();

            if (encerrar.equalsIgnoreCase("y")) {
                aux = 1;

            }
            limpar();
        }

        print("Deseja mudar seu nome? [Y/N]");
        String nome2 = entrada.nextLine();
        if (nome2.equalsIgnoreCase("y")) {
            print("Digite o novo nome: ");
            String novo_nome = entrada.nextLine();
            matriz[0] = novo_nome;
            limpar();
        }

        print("Deseja fazer um depósito? [Y/N]");
        String deposito_novo = entrada.nextLine();
        if (deposito_novo.equalsIgnoreCase("y")) {
            print("Quanto deseja depositar");
            double temporario = entrada.nextDouble();
            double a = Double.parseDouble(matriz[2].toString());
            a += temporario;

            print("-Nome: " + matriz[0] +
                    "\n-Numero de Cadastro: " + matriz[1] +
                    "\n-Quantia no banco: " + "R$" + a);
            entrada.nextLine();
        }

        print("Irá fazer um saque? [Y/N]");
        String saque = entrada.nextLine();
        if (saque.equalsIgnoreCase("y")) {
            print("Quanto irá sacar? ");
            double saque2 = entrada.nextDouble();
            double b = Double.parseDouble(matriz[2].toString());
            double finalVariavel = (b = -saque2) - taxa_saque;

            print("-Nome: " + matriz[0] +
                    "\n-Numero de Cadastro: " + matriz[1] +
                    "\n-Quantia no banco: " + "R$" + finalVariavel);
            entrada.nextLine();
        }

        entrada.close();
    }

    public static void print(String texto) {
        System.out.println(texto);
    }

    public static void limpar() {
        for (int i = 0; i < 50; i++) {
            print(" ");
        }
    }
}
