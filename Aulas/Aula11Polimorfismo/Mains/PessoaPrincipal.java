package Aulas.Aula11Polimorfismo.Mains;

import Aulas.Aula11Polimorfismo.Domínios.PessoaTest01;
import Aulas.Aula11Polimorfismo.Domínios.Programador;

public class PessoaPrincipal {
    public static void main(String[] args) {
        PessoaTest01 pessoa = new PessoaTest01();
        pessoa.trabalhar();
        Programador p = new Programador();
        p.trabalhar();
    }
}
