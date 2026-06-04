package Aulas.Aula15Abstract.Exercicios.PessoaClsAbs;

public class PessoaFisica extends Pessoa {
    public String cpf;

    @Override
    public void efetuarCompra() {
        System.out.println("Pessoa fisica cpf: " + this.cpf + " efetuando compra em:  " + this.cidade );
    }

    public static void main(String[] args) {
        PessoaFisica p = new PessoaFisica();
        p.cidade = "Caçapava do Sul";
        p.cpf = "45454656";

        p.efetuarCompra();
    }
    
}
