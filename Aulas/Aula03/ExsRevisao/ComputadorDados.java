package Aulas.Aula03.ExsRevisao;

import java.util.Scanner;

public class ComputadorDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Computador C1 = new Computador(null, null, null, 0);

        System.out.println("Informe os dados do Produto");
        System.out.println("marca: ");
        C1.setMarca(teclado.nextLine());
        System.out.println("Modelo: ");
        C1.setModelo(teclado.nextLine());
        System.out.println("tipo: ");
        C1.setTipo(teclado.nextLine());
        System.out.println("Preço: ");
        C1.setPreco(teclado.nextDouble());
        
        C1.exibirComputador();

        Computador C2 = new Computador("Acer", "Aspire", "Notebook", 2600);

        C2.exibirComputador();


        teclado.close();
    }
    
}
