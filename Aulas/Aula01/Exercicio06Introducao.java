/*5 - Escreva um algoritmo que leia 3 valores pelo teclado e então informe qual
o maior deles.
Ajuste o exercício 5 de maneira que mostre os valores informados em ordem crescente. */
package Aulas.Aula01;

import java.util.Scanner;

public class Exercicio06Introducao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float[] numeros = new float[3];
        float maiorNumero = 0;
        float temp;

        for (int i = 0; i < 3; i++){
            System.out.println("Digite o "+(i+1)+"º número:");
            numeros[i] = teclado.nextFloat();
            if (numeros[i]>=maiorNumero) {
                maiorNumero = numeros[i];           
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (numeros[i] > numeros[j]) {
                    temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        System.out.println("\nO maior número é: " + maiorNumero);
        
        System.out.println("Números em ordem crescente:");
        for (int i = 0; i < 3; i++) {
            System.out.print(numeros[i]);
                System.out.print("\n");
            
        }
        
        teclado.close();
    }
}
