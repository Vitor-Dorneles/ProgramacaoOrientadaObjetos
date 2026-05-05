package Aulas.Aula11Polimorfismo.Sobrescrita.Domínios;

public class Cachorro extends Animal {
    @Override // serve como identificação
    public void fazerSom() {
        System.out.println("au au");
    }
}
