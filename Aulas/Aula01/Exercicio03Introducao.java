package Aulas.Aula01;

import java.util.Scanner;

public class Exercicio03Introducao {
    public static void main(String[] args) {
        float n1, n2, n3, n4;
        float media;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o 1º número:");
        n1 = teclado.nextFloat();
        
        System.out.println("Digite o 2º número:");
        n2 = teclado.nextFloat();
        
        System.out.println("Digite o 3º número:");
        n3 = teclado.nextFloat();
        
        System.out.println("Digite o 4º número:");
        n4 = teclado.nextFloat();

        
        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("\nA média dos números é: " + media);
        
        
        
        System.out.println("Números superiores à média:");
      
        if (n1 > media) 
            System.out.println(n1);
        if (n2 > media) 
            System.out.println(n2);
        if (n3 > media) 
            System.out.println(n3);
        if (n4 > media) 
            System.out.println(n4);

        teclado.close();
    }
}