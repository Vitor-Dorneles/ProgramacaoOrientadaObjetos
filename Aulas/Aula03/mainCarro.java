package Aulas.Aula03;

import java.util.Scanner;

public class mainCarro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int i = 0;
        int n = 4;
        Carro[] a = new Carro[n];
        
        do {
            a[i] = new Carro();
        System.out.println("\nInforme os dados do Carro");


        System.out.println("Marca: ");
        a[i].marca = teclado.nextLine();

        System.out.println("Modelo: ");
        a[i].modelo = teclado.nextLine();

        System.out.println("O seu ano de fabricação: ");
        a[i].anoFabricacao = teclado.nextInt();
        
        i++;
        } while(n==2);




        teclado.close();
    }

    
}
