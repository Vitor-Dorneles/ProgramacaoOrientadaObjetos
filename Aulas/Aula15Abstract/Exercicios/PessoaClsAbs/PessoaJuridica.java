package Aulas.Aula15Abstract.Exercicios.PessoaClsAbs;

public class PessoaJuridica extends Pessoa {
    public String cnpj;

    @Override
    public void efetuarCompra() {
        System.out.println(this.nome + " está efetuando compra no seu CNPJ: " + this.cnpj);
    }
    
    public static void main(String[] args) {
        PessoaJuridica pp = new PessoaJuridica();
        pp.nome = "ABC";
        pp.cnpj = "4578/448-45";

        pp.efetuarCompra();
    }
}
