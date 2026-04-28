package Domínios;

public class Onibus extends Carro {
    
    private String modelo;



    public void exibirDados() {
        System.out.println("Estou na classe onibus");
        System.out.println(this.modelo);
        System.out.println(this.nome); // herdando atributos da classe carro
    }
    



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }  
}
