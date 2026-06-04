package Aulas.Aula15Abstract.InterfaceA.AnimalAbstract;

public class Gato implements Animal {
    public void emitirSom() {
        System.out.println("MIA");
    }

    public boolean verificarVacinacao() {
        System.out.println("Verificando vacina gato");
        return true;
    }
}
