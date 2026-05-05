package Aulas.Aula11Polimorfismo.Mains;

import Aulas.Aula11Polimorfismo.Domínios.Animal;
import Aulas.Aula11Polimorfismo.Domínios.Cachorro;
import Aulas.Aula11Polimorfismo.Domínios.Passarinho;
import Aulas.Aula11Polimorfismo.Domínios.Peixe;

public class AnimalPrincipal {
    public static void main(String[] args) {
        System.out.println("Animal: ");
        Animal a = new Animal();
        a.fazerSom();

        System.out.println("\n Cachorro");
        Cachorro c = new Cachorro();
        c.fazerSom();

        a = new Cachorro();
        a.fazerSom();
        
        Peixe p = new Peixe();
        p.fazerSom();

        Passarinho passarinho = new Passarinho();
        passarinho.fazerSom();

        
    }
    
}
