// Data: 03/03/2026
/*10 - Escreva um programa Java que use um para calcular a média de vários números reais lidos do usuário até que seja lido o número 0. */
package Aulas.Aula02;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n, somatorio = 0, media = 0;
        int i = 0;

        while (true) {
            System.out.println("Digite um valor: ");
            n = teclado.nextDouble();
            somatorio+=n; //somatorio=somatorio +n;

            if (n<=0) {
                break;
                
            }
            i++;
            media = somatorio/i;
            System.out.println("Media: "+media);

        }
        teclado.close();
    }
    
}
