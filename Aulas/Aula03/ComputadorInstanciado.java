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

import java.util.Scanner;

public class ComputadorInstanciado {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    Computador c2 = new Computador();
    Computador a1 = new Computador();
    
    System.out.println("Cadastre seu computador:");
    System.out.println("Marca: ");
    a1.marca = teclado.nextLine();

    System.out.println("Modelo: ");
    a1.modelo = teclado.nextLine();

    System.out.println("Tipo(notebook, netbook, tablet, etc):  ");
    a1.tipo = teclado.nextLine();

    System.out.println("Seu valor: ");
    a1.valor = teclado.nextDouble();

    System.out.println("Seu computador é:\n");
    System.out.println(c2.marca);




    teclado.close();
    }
    
}
