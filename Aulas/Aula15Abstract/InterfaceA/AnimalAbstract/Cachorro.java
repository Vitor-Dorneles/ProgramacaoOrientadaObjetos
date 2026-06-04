package Aulas.Aula15Abstract.InterfaceA.AnimalAbstract;

public class Cachorro implements Animal {
    public String nome;
    public String raca;
    


    public boolean verificarVacinacao() {
        System.out.println("Verificando vacina cachorro");
        return true;
    }
    public void emitirSom() {
        System.out.println("Ai ai");
    }
    
}
