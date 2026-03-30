package Aulas.Aula05;

import java.util.Scanner;

public class ExercicioTemperatura {
    // 5 - Escreva um programa que leia uma temperatura em String do teclado (ex: "25.5") 
    // e a converta para double para realizar um cálculo (ex: converter para Fahrenheit). 
    // Use Double.parseDouble() para a conversão. Trate a exceção NumberFormatException, que ocorre se o usuário digitar 
    // algo como "25,5" (com vírgula) ou "vinte graus", impedindo a conversão.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius (ex: 25.5): ");
        String TemperaturaDigitada = teclado.nextLine();

        try {
            double celsius = Double.parseDouble(TemperaturaDigitada);
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.printf("A temperatura em Fahrenheit é: %.2f\n", fahrenheit);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida, digite um número válido para a temperatura. " + e.getMessage());
        }

        teclado.close();
    }
}
