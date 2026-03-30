// Data: 03/03/2026
/*7 - Escreva um programa Java que use um laço para ler a nota de vários alunos até que seja lida a nota -1.
 */
package Aulas.Aula02;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float notas=0;
        System.out.println("Informe a nota de seus alunos: ");
        while (notas != -1) {
            notas = teclado.nextFloat();
            System.out.println("Nota "+notas+" registrada, insira (-1) para encerrar.\n");            
        }
        System.out.println("Sistema encerrado");
        teclado.close();
    }
    
}
