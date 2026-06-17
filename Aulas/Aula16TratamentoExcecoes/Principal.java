package Aulas.Aula16TratamentoExcecoes;

import java.util.Scanner;

public class Principal {

    private static void divide(double n1, double n2) throws MinhaExcecao {
        if (n2 == 0) {
            throw new MinhaExcecao("Impossivel realizar divisão por zero");
        }
        else {
                System.out.println("O resultado da divisão é: " + (n1/n2));
            }
    }
    public static void main(String[] args) throws MinhaExcecao {
        Scanner sc = new Scanner(System.in);
        double n1, n2;
        System.out.println("Digite dois numeros: ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();

        try {
            divide(n1,n2);
        } catch (MinhaExcecao e) {
            System.out.println("ERRO: " + e.getMessage());
        }



        sc.close();
    }
    
}
