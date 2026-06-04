package Aulas.Aula15Abstract.InterfaceA.AnimalAbstract;

public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();

        cachorro.emitirSom(); // au au

        Animal gato = new Gato();
        gato.emitirSom(); // miau

        Gato g = new Gato();
        System.out.println(g.verificarVacinacao());
        System.out.println(cachorro.verificarVacinacao());

    }
}
