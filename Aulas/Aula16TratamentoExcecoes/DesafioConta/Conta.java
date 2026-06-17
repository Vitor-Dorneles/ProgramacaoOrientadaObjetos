package Aulas.Aula16TratamentoExcecoes.DesafioConta;

public abstract class Conta {
    protected double saldo;

    public abstract void depositar(double valor) throws SaldoInsuficienteException;

    public abstract void sacar(double valor) throws SaldoInsuficienteException;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
}
