package Aulas.Aula15Abstract.Exercicios.ContaClasseAbstract;


public class ContaConcreta extends Conta {


    public double depositar(double saldoDeposito) {
        saldo = saldo + saldoDeposito; //atualizamos o saldo desta forma
        return saldo;
    }
    
    public double sacar(double valorSaque) {
        if (valorSaque <= saldo) {
            saldo = saldo - valorSaque;
            return saldo;
        }
        System.out.println("Valor insuficiente para saque");
        return saldo;
    }
    
}
