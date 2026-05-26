package Aulas.Aula12ExerRevisao.ExcsFixacao.Locadora;

public class Moto extends Veiculo {
    private boolean sideCar;

    public Moto(String marca, double topSpeed, boolean sideCar) {
        super(marca, topSpeed);
        this.sideCar = sideCar;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Sidecar: " + this.sideCar);
    }
    
}
