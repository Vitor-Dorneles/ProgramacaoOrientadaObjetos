package Mains;

import Domínios.Pessoa;
import Domínios.PessoaJuridica;

public class PessoaDados {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Vitor", 21);
        pessoa.exibeDados();
        PessoaJuridica pj1 = new PessoaJuridica("Florencio", 41, 898989, "fabio", "26/04/2026");
        pj1.exibeDados();

    }
    
}
