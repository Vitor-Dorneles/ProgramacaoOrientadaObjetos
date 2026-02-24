package poo;

import java.util.Scanner;

public class Exercicio01Introducao {
	
	public static void main(String[] args) {
		
	int Numero1;
	int Numero2;
	
	
	
	
	System.out.println("Digite um número:");
	Scanner teclado=new Scanner(System.in);
	Numero1=teclado.nextInt();
	
	System.out.println("Digite um número:");
	Scanner teclado2=new Scanner(System.in);
	Numero2=teclado2.nextInt();
	
	
	int opcao;
	Scanner teclado3 =new Scanner(System.in);
	
	System.out.println("Escolha uma operação:");
	System.out.println("Digite 1 para soma");
	System.out.println("Digite 2 para subtrair");
	System.out.println("Digite 3 para multiplicar");
	System.out.println("Digite 4 para dividir");
	System.out.println("Digite 5 para sair");
	
	opcao= teclado3.nextInt();
	switch(opcao) {
	case 1:
		int soma;
		soma=Numero1+Numero2;
		System.out.println("Sua soma é:"+soma);
		break;
		
	case 2:
		int subtracao;
		subtracao=Numero1-Numero2;
		System.out.println("Sua subtracao é:"+subtracao);
		break;
	case 3:
		int multiplicacao;
		multiplicacao=Numero1*Numero2;
		System.out.println("Sua subtracao é:"+multiplicacao);
		break;
	case 4:
		int divisao;
		divisao=Numero1/Numero2;
		System.out.println("Sua subtracao é:"+divisao);
		break;
	case 5:
		System.out.println("sair");
		break;
		
		default:
		System.out.println("Digite uma opcao valida");
		break;
		
	}

			
	
	
	
	
		
		
		
	}	
	
}
