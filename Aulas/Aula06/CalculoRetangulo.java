package Aulas.Aula06;

import java.util.Scanner;

public class CalculoRetangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Largura: ");
        double largura = teclado.nextDouble();

        System.out.print("Altura: ");
        double altura = teclado.nextDouble();

        Retangulo ret = new Retangulo(largura, altura);

        System.out.println("Área: " + ret.calcularArea());
        System.out.println("Perímetro: " + ret.calcularPerimetro());
        System.out.println("Diagonal: " + ret.calcularDiagonal());
        System.out.println("É quadrado: " + ret.ehQuadrado());

        teclado.close();
    }
    
}
