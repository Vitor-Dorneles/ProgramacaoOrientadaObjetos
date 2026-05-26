package Aulas.Aula12ExerRevisao.ExcsFixacao.Locadora;

public class Veiculo {
    protected String marca;
    protected double topSpeed;
    

    public Veiculo(String marca, double topSpeed) {
        this.marca = marca;
        this.topSpeed = topSpeed;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("TopSpeed: " + this.topSpeed);
    }

    public double calcularCustoLocacao(int diasAlugados) {
        return diasAlugados * 100;
    }

    public double calcularCustoLocacao(int diasAlugados, double diaria) {
        return diasAlugados * diaria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
    

    
}

