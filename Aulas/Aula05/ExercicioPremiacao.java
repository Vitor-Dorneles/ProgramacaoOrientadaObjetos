// 6 - Escreva um programa que tenha um valor fixo de premiação (ex: double premio = 5000.0). 
// Peça ao usuário para digitar quantos ganhadores dividirão esse prêmio.
// Tratamento 1: Use ArithmeticException para o caso de o usuário digitar 0 (divisão por zero).
// Tratamento 2: Use InputMismatchException para garantir que ele digitou um número inteiro.
package Aulas.Aula05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioPremiacao {
    
    public static void main(String[] args) {
        double premio = 5000.0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de ganhadores que dividirão o prêmio de " + premio + ": ");

        try {
            int ganhadores = teclado.nextInt();
            double premioPorGanhador = premio / ganhadores;
            System.out.printf("Cada ganhador receberá: %.2f\n", premioPorGanhador);
        } catch (ArithmeticException e) {
            System.out.println("Número de ganhadores inválido");
        } catch (InputMismatchException e) {
            System.out.println("Erro, digite um número inteiro para os ganhadores.");
        }

        teclado.close();
    }
    
}
