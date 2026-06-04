package Aulas.Aula15Abstract.Exercicios.ContaClasseAbstract;

public class ContaCorrente extends ContaConcreta {

    @Override
    public double depositar(double saldoDeposito) {
        super.depositar(saldoDeposito);
        System.out.println("Dentro da classe ContaCorrente");
        return saldo;
    }

    @Override
    public double sacar(double valorSaque) {
        super.sacar(valorSaque);
        System.out.println("Dentro da classe contaCorrente");
        return saldo;
    }
    
}
