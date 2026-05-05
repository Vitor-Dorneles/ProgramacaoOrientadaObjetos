package Mains;

import Domínios.Carro;
import Domínios.Onibus;

public class Dados {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Fusca");
        carro.exibirDados();

        Onibus onibus = new Onibus();
        onibus.setNome("Ouro e Prata");
        onibus.setModelo("Azul");

        onibus.exibirDados();
    }
    
}
