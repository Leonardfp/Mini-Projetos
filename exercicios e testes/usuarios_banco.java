public class usuarios_banco {
    private String nome;
    private double deposito;
    private int numero_conta;
    private double saque;

    public void usuarios_banco(String nome, double deposito, int numero_conta) {
        this.nome = nome;
        this.deposito = deposito;
        this.numero_conta = numero_conta;

    }

    public double getsaque() {
        return deposito;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero) {
        this.numero_conta = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getDeposito() {
        return deposito;
    }
}
