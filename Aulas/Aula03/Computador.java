// Data: 10/03/2026
/*•
2 - Crie uma classe chamada Computador que possua 4 atributos: marca, modelo, tipo
(notebook, netbook, tablet, etc) e preço.
•
Essa classe Computador também deverá ser executável, entretanto crie uma outra classe
executável que irá instanciar a classe Computador, criando 2 objetos. O primeiro objeto deverá
ser criado através da solicitação dos valores ao usuário por linha de execução. Já, os valores do
segundo objeto, deverão ser definidos no código-fonte da classe que o criou. Exiba na tela os
resultados. */

package Aulas.Aula03;

public class Computador {
    String marca;
    String modelo;
    String tipo;
    Double valor;

    Computador c2 = new Computador();
        c2.marca = "Acer";
        c2.modelo = "Aspire 5";
        c2.tipo = "Notebook";
        c2.valor = 3000D;

    public static void main(String[] args) {
        Computador c2 = new Computador();
        c2.marca = "Acer";
        c2.modelo = "Aspire 5";
        c2.tipo = "Notebook";
        c2.valor = 3000D;
    }
    
}

