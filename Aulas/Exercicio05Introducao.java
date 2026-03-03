/*5 - Escreva um algoritmo que leia 3 valores pelo teclado e então informe qual o maior deles. */
package Aulas;

import java.util.Scanner;

public class Exercicio05Introducao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float[] numeros = new float[3];
        float maiorNumero = 0;

        for (int i = 0; i < 3; i++){
            System.out.println("Digite o "+(i+1)+"º número:");
            numeros[i] = teclado.nextFloat();
            if (numeros[i]>=maiorNumero) {
                maiorNumero = numeros[i];           
            }
        }
        System.out.println("O maior número é:"+maiorNumero);

        teclado.close();
        
    }
    
}
