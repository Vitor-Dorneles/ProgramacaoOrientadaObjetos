package Aulas.Aula05;

import java.util.Scanner;

public class ExercicioVariaveis {
    public static void main(String[] args) {
        // 3 – Faça o tratamento de exceções em conversões de valores lidos pelo teclado. Por exemplo, ao ler uma string e converter ela para double.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        String ValorLido = teclado.nextLine();

        try {
            double ValorConvertido = Double.parseDouble(ValorLido);
            System.out.println("O número digitado foi: " + ValorConvertido);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
        } 
            teclado.close();
        

    }
    
}
