package Domínios;

public class Cachorro extends Animal{
    private String raca;


    public void exibirDados() {
        super.exibirDados();
        System.out.println(this.raca);
    }
    public void latir() {
        exibirDados();
        System.out.println(this.som);
    }


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
