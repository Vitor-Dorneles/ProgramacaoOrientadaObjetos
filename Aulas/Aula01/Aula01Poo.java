package Aulas.Aula01;

import java.util.Scanner;

public class Aula01Poo {

	public static void main(String[] args) {
		

		System.out.print("GREMIO");
		System.out.println("    quebra linha");
		System.out.print("teste");
		
		int idade;
		idade=18;
		
		System.out.print("A idade é:"+idade);
		System.out.println("\nO indivíduo tem,"+idade+"anos de idade");
		
		char copa='G';
		System.out.println("O char: "+copa);
		
		float f=3.14f;
		
		System.out.println("o float: "+f);
		
		double d=3.141516;
		System.out.println("o double: "+d);
		
		
		String nome; //vamos ler
		Scanner teclado =new Scanner(System.in); 
		System.out.println("Digite o nome: ");
		nome=teclado.nextLine();
		System.out.println("O nome é: "+nome);
		//ler float
		float valor;
		System.out.println("Digite um valor:");
		valor=teclado.nextFloat();
		System.out.println("Valor que foi digitado: "+valor);
		
		
		
		String jdm;
		Scanner teclado2 =new Scanner(System.in);
		System.out.println("descrimine esse valor:");
		jdm=teclado2.nextLine();
		
		System.out.println("A despesa é:" +jdm);
		
		
		int opcao;
		System.out.println("Digite uma opção:");
		System.out.println("Digite 1 para cadastrar");
		System.out.println("Digite 2 para consultar");
		System.out.println("Digite 3 para sair");
		
		opcao=teclado.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Cadastro");
			break;
			
		case 2:
			System.out.println("Cadastro2");
			break;
		case 3:
			System.out.println("sair");
			break;
			
			default:
			System.out.println("Digite uma opcao valida");
			break;
		
			
		}
		teclado.close();
		teclado2.close();
		}
	
		

}
