package Aulas.Aula03.ExsRevisao;

public class Computador {
    private String marca;
    private String modelo;
    private String tipo;
    private double preco;

    public Computador(String marca, String modelo, String tipo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.preco = preco;

    }

    public void exibirComputador() {
        System.out.println("\n Dados do computador");
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.tipo);
        System.out.println(this.preco);
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


    public String getTipo() {

        return tipo;
    }


    public void setTipo(String tipo) {
        if (tipo.equals("notebook") || tipo.equals("tablet") || tipo.equals("netbook")) {
        this.tipo = tipo;
    } else {
        System.out.println("Tipo inválido!");
    }
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
