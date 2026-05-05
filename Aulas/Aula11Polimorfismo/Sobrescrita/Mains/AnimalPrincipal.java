package Aulas.Aula11Polimorfismo.Sobrescrita.Mains;

import Aulas.Aula11Polimorfismo.Sobrescrita.Domínios.Animal;
import Aulas.Aula11Polimorfismo.Sobrescrita.Domínios.Cachorro;
import Aulas.Aula11Polimorfismo.Sobrescrita.Domínios.Passarinho;
import Aulas.Aula11Polimorfismo.Sobrescrita.Domínios.Peixe;

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
