package Aulas.Aula16TratamentoExcecoes.DesafioConta;

public class SaldoInsuficienteException extends IllegalArgumentException {

    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
    
}
