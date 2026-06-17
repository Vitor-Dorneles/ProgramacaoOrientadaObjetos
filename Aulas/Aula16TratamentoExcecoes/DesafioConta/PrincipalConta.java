package Aulas.Aula16TratamentoExcecoes.DesafioConta;

public class PrincipalConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);

        System.out.println(cc.getSaldo());
        cc.depositar(10);
        cc.sacar(-100);
    }
    
}
