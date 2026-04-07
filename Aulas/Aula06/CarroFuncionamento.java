package Aulas.Aula06;

import java.util.Scanner;

public class CarroFuncionamento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Modelo: ");
        String modelo = teclado.nextLine();

        System.out.print("Velocidade máxima: ");
        int velMax = teclado.nextInt();

        Carro carro = new Carro(modelo, 0, velMax);

        System.out.print("Acelerar (valor): ");
        carro.acelerar(teclado.nextInt());
        System.out.println("Velocidade atual: " + carro.velocidadeAtual);
        System.out.println("Atingiu máxima: " + carro.atingiuVelocidadeMaxima());

        System.out.print("Distância da viagem (km): ");
        double distancia = teclado.nextDouble();
        System.out.println("Tempo de viagem: " + carro.calcularTempoViagem(distancia) + "h");

        System.out.print("Frear (valor): ");
        carro.frear(teclado.nextInt());
        System.out.println("Velocidade após frear: " + carro.velocidadeAtual);

        teclado.close();
    }
    
}
