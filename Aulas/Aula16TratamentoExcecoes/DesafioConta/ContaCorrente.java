package Aulas.Aula16TratamentoExcecoes.DesafioConta;


public class ContaCorrente extends Conta {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0)
            throw new SaldoInsuficienteException("Impossivel realizar o deposito");
        saldo += valor;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo )
            throw new SaldoInsuficienteException("Saldo insuficente");
        else if (valor <= 0)
            throw new SaldoInsuficienteException("Impossível sacar zero ou valor negativo");
        saldo -= valor;
    }
    
}
