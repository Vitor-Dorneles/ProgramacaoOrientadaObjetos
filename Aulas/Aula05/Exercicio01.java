package Aulas.Aula05;

import java.util.Scanner;
import java.util.InputMismatchException; // exceção para tratamento de erros do scanner, com tipos diferentes de variáveis

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um número inteiro para descobrir a raiz quadrada dele: ");

		try {
			// variavel protegida
			int numeroUsuario = teclado.nextInt();

			double raizQuadrada = Math.sqrt(numeroUsuario); // funcao que retorna a raiz quadrada
			System.out.println("A raiz quadrada de " + numeroUsuario + " é: " + raizQuadrada);

		} catch (InputMismatchException e) {
			// o Scanner acusará erro de tipo incompatível e cai aqui
			System.out.println("Valor inválido. Digite um número");
		}

		teclado.close();
	}
}