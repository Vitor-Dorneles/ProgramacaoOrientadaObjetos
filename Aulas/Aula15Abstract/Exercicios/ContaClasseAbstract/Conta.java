package Aulas.Aula15Abstract.Exercicios.ContaClasseAbstract;

public abstract class Conta {
    public double saldo;
    public double limite;

    public abstract double depositar(double saldoDeposito); // metodos abstratos não tem corpo de instruções

    public abstract double sacar(double valorSaque);    

}