package Aulas.Aula03;

import java.util.Scanner;

public class ComputadorInstanciado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- OBJETO 1: Valores solicitados ao usuário ---
        Computador c1 = new Computador();
        System.out.println("=== Cadastro do Primeiro Computador ===");

        System.out.print("Digite a marca: ");
        c1.marca = scanner.nextLine();

        System.out.print("Digite o modelo: ");
        c1.modelo = scanner.nextLine();

        System.out.print("Digite o tipo (notebook, desktop, etc): ");
        c1.tipo = scanner.nextLine();

        System.out.print("Digite o preco: ");
        c1.preco = scanner.nextDouble();

        // --- OBJETO 2: Valores definidos no código-fonte ---
        Computador c2 = new Computador();
        c2.marca = "Acer";
        c2.modelo = "Aspire 5";
        c2.tipo = "Notebook";
        c2.preco = 3000.0D;

        // --- EXIBIÇÃO DOS RESULTADOS ---
        System.out.println("\n=== Resultados ===");

        System.out.println("Computador 1:");
        System.out.println(
                "Marca: " + c1.marca + " | Modelo: " + c1.modelo + " | Tipo: " + c1.tipo + " | Preço: R$" + c1.preco);

        System.out.println("\nComputador 2:");
        System.out.println(
                "Marca: " + c2.marca + " | Modelo: " + c2.modelo + " | Tipo: " + c2.tipo + " | Preço: R$" + c2.preco);

        // Boa prática: fechar o scanner após o uso
        scanner.close();
    }
}