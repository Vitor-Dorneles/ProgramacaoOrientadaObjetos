// Data: 19/05/2026
public class Computador {
    protected String marca;
    private String modelo;

    public Computador(String modelo) {
        this.modelo = modelo;
    }

    public void exibeModelo() {
        System.out.println(this.marca);
        System.out.println(this.modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}