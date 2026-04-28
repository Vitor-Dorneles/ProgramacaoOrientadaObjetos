package Mains;

import Domínios.Cachorro;

public class DadosCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.setNome("Flaviio");
        cachorro.setIdade(12);
        cachorro.setRaca("Titibul");
        cachorro.setSom("Auuuuu");

        //cachorro.exibirDados();
        cachorro.latir();
    }
    
}
