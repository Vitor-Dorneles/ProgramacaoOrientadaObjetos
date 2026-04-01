// Data: 31/03/2026
// 2-Crie uma classe chamada ContaBancaria com os atributos titular e saldo.Crie um construtor que inicialize esses atributos.Implemente os métodos depositar(double valor),que adiciona um valor ao saldo,sacar(double valor),que realiza o saque apenas se houver saldo suficiente e retorna true ou false,transferir(double valor,ContaBancaria destino),que transfere um valor para outra conta caso haja saldo suficiente,e consultarSaldo(),que retorna o saldo atual da conta.

package Aulas.Aula06;

import java.util.Scanner;

public class ContaBancaria {
    
    public String titular;
    public double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    // Implemente os métodos depositar(double valor),que adiciona um valor ao saldo
    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public boolean sacar(double valorSaque) {
        if (this.saldo >= valorSaque) {
            this.saldo -= valorSaque;
            return true;
        }
        return false;
    }

    public boolean transferir(double valorTransferencia, ContaBancaria destino) {
        if (valorTransferencia > 0 && this.saldo >= valorTransferencia) {
            this.saldo -= valorTransferencia;
            destino.saldo += valorTransferencia;
            return true;
        }
        return false;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome do titular da conta: ");
        String nomeConta = teclado.nextLine();
        System.out.println("Informe o saldo inicial da conta: ");
        double saldoAtual = teclado.nextDouble();

        ContaBancaria conta = new ContaBancaria(nomeConta, saldoAtual);
        

        System.out.println("Informe o valor que deseja depositar: R$");
        double valorNovoDeposito = teclado.nextDouble();
        conta.depositar(valorNovoDeposito);

        System.out.println("Informe o valor que deseja sacar: R$");
        double valorNovoSaque = teclado.nextDouble();
        conta.sacar(valorNovoSaque);

        System.out.println("Informe o valor que deseja transferir: R$");
        double valorNovaTransferencia = teclado.nextDouble();
        System.out.print("Informe a conta de destino");
        String novoTitular = teclado.nextLine();

        ContaBancaria contaDestino = new ContaBancaria(novoTitular, 0);
        conta.transferir(valorNovaTransferencia, contaDestino);

        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo atual: R$" + conta.consultarSaldo());
        System.out.println("Saldo da conta destino: R$" + contaDestino.consultarSaldo());

        teclado.close();
    }
    
}
