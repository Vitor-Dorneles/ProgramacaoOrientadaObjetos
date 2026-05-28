package Aulas.Aula12ExerRevisao.ExcsFixacao.Locadora;

public class Carro extends Veiculo{
    private int numeroPortas;

    public Carro(String marca, double topSpeed, int numeroPortas) {
        super(marca, topSpeed);
        this.numeroPortas = numeroPortas;
    }
    
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println(this.numeroPortas);
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
