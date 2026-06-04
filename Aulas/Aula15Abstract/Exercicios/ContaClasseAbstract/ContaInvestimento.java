package Aulas.Aula15Abstract.Exercicios.ContaClasseAbstract;

public class ContaInvestimento extends Conta {

    public double depositar(double saldoDeposito) {
        System.out.println("Dentro de sua conta investimentos");
        saldo = saldo + saldoDeposito;
        return saldo;
    }

    public double sacar(double valorSaque) {
        System.out.println("Dentro da conta investimentos");
        if (saldo >= valorSaque) {
            saldo = saldo - valorSaque;
            return saldo;
        }
        System.out.println("Saldo insuficiente para o saque");
        return saldo;
    }
    
}
