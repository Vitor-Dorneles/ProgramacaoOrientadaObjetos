public class Veiculo {
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private double quilometragem;
    private String placa;

    public Veiculo(String modelo, String marca, String placa, int anoFabricacao, double quilometragem) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
        this.placa = placa;
    }
    
    
    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getQuilometragem() {
        return quilometragem;
    }
    
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
    public String getPlaca() {
        return placa;
    }
    
}
