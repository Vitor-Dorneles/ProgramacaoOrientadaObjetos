package Aulas.Aula05;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExercicioCalculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // tudo que pode dar erro aqui dentro
        try {
            System.out.println("Digite o primeiro número inteiro:");
            int num1 = teclado.nextInt();
            
            System.out.println("Digite o segundo número inteiro:");
            int num2 = teclado.nextInt();
            
            System.out.println("Escolha a operação: 1 para Somar, 2 para Subtrair, 3 para Multiplicar, 4 para Dividir ");
            int operacao = teclado.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Resultado da soma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Resultado da divisão: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Operação inválida");
                    break;
            }
            
            
            
        } catch (InputMismatchException e) { 
            System.out.println("Erro de entrada: Você precisa digitar um número inteiro válido");
        } catch (ArithmeticException e) { 
            System.out.println("Erro: Divisão por zero não é válida " + e.getMessage());
        }
        
        teclado.close();
    }
}