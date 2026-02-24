package poo;

import java.util.Scanner;

public class Exercicio02Introducao {
	
	public static void main(String[] args) {
		
		
		int kmInicioDoDia;
		int kmFinalDoDia;
		int kmsPercorridos;
		float litrosGasolinaGastos;
		double valorRecebido;
		double mediaConsumo;
		double valorGasto;
		double lucroDia;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Qual a quilometragem do carro antes de inicar o dia?");
		
		kmInicioDoDia=teclado.nextInt();
		
		System.out.println("Qual a quilometragem do carro na finalizacao do dia?");
		kmFinalDoDia=teclado.nextInt();
		
		kmsPercorridos=kmFinalDoDia-kmInicioDoDia;
		
		System.out.println("Quantos litros de gasolina foram gastos?");
		litrosGasolinaGastos=teclado.nextFloat();
		valorGasto=litrosGasolinaGastos * 4.90;
		
		System.out.println("Qual o valor recebido hoje ao todo:");
		valorRecebido=teclado.nextDouble();
		
		mediaConsumo=kmsPercorridos/litrosGasolinaGastos;
		lucroDia=valorRecebido-valorGasto;
		
		System.out.println("A sua media de consumo foi:"+mediaConsumo+"\n com um lucro no dia de: R$"+lucroDia );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
