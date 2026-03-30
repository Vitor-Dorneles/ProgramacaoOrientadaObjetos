// Data: 03/03/2026
/*8 - Escreva um programa Java que use um laço para ler vários nomes de cidades do usuário até que o nome "São Paulo" seja lido. */
package Aulas.Aula02;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cidade = "São Paulo";
        String cidade2= "Qualquer";
        System.out.println("Digite uma cidade: ");

        while (true) {
        if(cidade2.equalsIgnoreCase(cidade)){
        System.out.println("Programa encerrado");     
        break;
        }
        teclado.close();
    }
        }

    }

