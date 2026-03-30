// Data: 17/03/2026
package Aulas.Aula04;

public class Carro {

    public String marca;
    public String modelo;

    // Construtores
    public Carro(String marcaCarro, String modeloCarro){
        System.out.println("Primeiro construtor");
        marca = marcaCarro;
        modelo = modeloCarro;
    }
    public Carro(String marca){
        System.out.println("Outro construtor");
        this.marca = marca;
    }

    public void alugar() {
        System.out.println("O carro "+ marca+ " e " + modelo+ " foi alugado");
    }
    public void devolver(){
        System.out.println("O carro "+ marca+ " e "+modelo+" foi devolvido");
    }
    public void mostrar(){
        System.out.println("O carro é "+ marca+ " e "+ modelo);
    }

    public String atribuicao(String marca, String modelo){
        String novoCarro = "marca" + "modelo";
        return novoCarro;

    }

    
}