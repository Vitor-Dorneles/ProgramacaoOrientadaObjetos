package Aulas.Aula03.ExsRevisao;

import java.util.Scanner;

public class CarroObjetos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Carro carro01 = new Carro();


        System.out.println("Insira os dados do carro");
        System.out.println("Marca: ");
        carro01.marca = teclado.nextLine();
        System.out.println("modelo: ");
        carro01.modelo = teclado.nextLine();
        System.out.println("Ano: ");
        carro01.anoFabricacao = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("\n");

        System.out.println(carro01.marca);
        System.out.println(carro01.modelo);
        System.out.println(carro01.anoFabricacao);

        System.out.println("\n");

        Carro carro02 = new Carro();
        System.out.print("Segundo carro: ");
        carro02.modelo = teclado.nextLine();

        System.out.println("Modelo do segundo carro: " + carro02.modelo);
        
        teclado.close();
    }
    
}
