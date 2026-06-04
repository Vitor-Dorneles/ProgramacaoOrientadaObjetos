package Aulas.Aula15Abstract.ClasseAbstrata.Animal;

public class Cachorro extends Animal {
    protected boolean status;
    protected String raca;

    @Override
    public void emiteSom() {
        System.out.println("Ai ai ai");
    }

    @Override
    public void exibeInfo() {
        super.exibeInfo();
        System.out.println("Raça: " + raca);
    }
    public boolean cuidarPatio(boolean status) {
        this.status = status;
        return status;
        
    }
    
}
