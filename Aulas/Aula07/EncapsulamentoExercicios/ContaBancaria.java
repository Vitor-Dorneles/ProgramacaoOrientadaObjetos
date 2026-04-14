import java.util.Scanner;

public class ContaBancaria {
    private double saldo;
    private double limite;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo, double limite) {
        this.setSaldo(saldo);
        this.setLimite(limite);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.err.println("Saldo inválido");
        } else {
            this.saldo = saldo;
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite < 0) {
            System.err.println("Limite inválido");
        } else {
            this.limite = limite;
        }
    }

    public void saque(double valor) {
        if (valor <= 0) {
            System.err.println("Valor de saque inválido");
        } else if (this.saldo - valor < -this.limite) {
            System.err.println("Saldo insuficiente. Limite ultrapassado");
        } else {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + this.saldo);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o saldo inicial: ");
        double saldo = teclado.nextDouble();

        System.out.print("Informe o limite da conta: ");
        double limite = teclado.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldo, limite);

        System.out.print("Informe o valor do saque: ");
        double valorSaque = teclado.nextDouble();

        conta.saque(valorSaque);

        teclado.close();
    }
}
