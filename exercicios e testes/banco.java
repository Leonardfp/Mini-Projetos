import java.util.Scanner;
import java.util.Random;

public class banco {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        boolean condicao_dinheiro = false;
        usuarios_banco usuario = new usuarios_banco();
        Scanner sc = new Scanner(System.in);
        int numero = aleatorio.nextInt(10000);
        System.out.println("Seu numero de é conta: " + numero);
        sc.nextLine();
        System.out.println("Digite o nome do usuário da conta");
        String nome_conta = sc.nextLine();
        System.out.println("Digite o quanto deseja depositar");
        double deposit = sc.nextDouble();
        usuario.setNumero_conta(numero);
        usuario.setNome(nome_conta);
        usuario.setDeposito(deposit);
        sc.nextLine();
        if (usuario.getDeposito() > 0) {
            System.out.println("Deseja sacar?\n [Sim]\n [Não]");
            String condicao_string = sc.nextLine();
            while (!condicao_dinheiro) {
                if (condicao_string.equalsIgnoreCase("Sim")) {
                    System.out.println("Digite quano que deseja sacar");
                    double saque = sc.nextDouble();

                    if (saque > usuario.getsaque()) {
                        System.out.println("Invalido o saque é maior que o dinheiro disponivel");

                    } else {
                        double dinheirosacado = usuario.getsaque() - saque - 5;
                        usuario.setDeposito(dinheirosacado);
                        System.out.println(usuario.getNome() + " Saque efetuado com sucesso! \n"
                                + "seu novo saldo será: RS" + usuario.getsaque());
                        break;
                    }
                } else {
                    System.out.println(
                            usuario.getNome()
                                    + " Obrigado por usar nosso aplicativo, para mais ações clique novamente!");
                    break;
                }
            }
        }
        while (!condicao_dinheiro) {
            System.out.println("Deseja depositar?\n[Sim]\n[Não]");
            String deposito_dinheiro = sc.nextLine();
            if (deposito_dinheiro.equalsIgnoreCase("Sim")) {
                System.out.println("Quanto deseja depositar em RS deseja depositar: ");
                double dinheirodepositado = sc.nextDouble();
                double i = usuario.getsaque() + dinheirodepositado;
                System.out.println(usuario.getNome() + " Voce acaba de depositar\n" + dinheirodepositado
                        + "\n Seu novo saldo será: " + i);
                condicao_dinheiro = true;
            }
            if (deposito_dinheiro.equalsIgnoreCase("nao")) {
                System.out.println(usuario.getNome()
                        + " Obrigado por usar nosso sistema retorne semmpre\n Para mais opções retorne ao menu acima! \n Seu saldo é de: "
                        + usuario.getDeposito());

                break;
            }
        }
        sc.close();
    }
}
