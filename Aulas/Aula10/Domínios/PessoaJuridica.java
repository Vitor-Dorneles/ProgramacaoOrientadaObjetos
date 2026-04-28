package Domínios;

public class PessoaJuridica extends Pessoa {
    private int cnpj;
    private String socio;
    private String dataAbertura;

    public PessoaJuridica(String nome, int idade, int cnpj, String socio, String dataAbertura) {
        super(nome, idade); // precisa ser chamado
        this.cnpj = cnpj;
        this.socio = socio;
        this.dataAbertura = dataAbertura;
    }
    
    public void exibeDados() {
        super.exibeDados();
        System.out.println(this.cnpj);
        System.out.println(this.socio);
        System.out.println(this.dataAbertura);
    }

}
