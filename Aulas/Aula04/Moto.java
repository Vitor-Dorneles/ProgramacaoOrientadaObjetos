package Aulas.Aula04;

public class Moto {
    public String marca;
    public String modelo;
    public String cilindradas;

    public void atribuirValor(String marca, String modelo, String cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    public String retornar() {
        return "A moto e " + this.marca + " " + this.modelo + " " + this.cilindradas + "cc";
    }
    
}
