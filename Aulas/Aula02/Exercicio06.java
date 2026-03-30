// Data: 03/03/2026
/*6- Escreva um programa Java que use um laço para ler uma sequência de números inteiros do usuário até que o número 0 seja lido.
 */
package Aulas.Aula02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new java.util.Scanner(System.in);
        int numeroInserido;

        do {
            System.out.println("Digite um número || Digite 0 para parar: ");
            numeroInserido = teclado.nextInt();
        } while(numeroInserido != 0);

        System.out.println("Sistema finalizado\n");

        teclado.close();
        
    }
    
}
