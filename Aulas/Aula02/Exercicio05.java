// Data: 03/03/2026
/*5 - Escreva um programa Java que use um laço para calcular o fatorial de um número inteiro. */
package Aulas.Aula02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {        
        Scanner teclado = new java.util.Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = teclado.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial =fatorial* i;
        }

        System.out.println("Fatorial de " + n + " = " + fatorial);
        teclado.close();
    }
    
}
