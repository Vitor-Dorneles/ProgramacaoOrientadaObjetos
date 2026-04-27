package Aulas.Aula03.ExsRevisao;
import java.util.Scanner;

public class CarroDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Carro carro1 = new Carro(null, null, 0);

        System.out.println("Informe os dados de seu carro:");
        System.out.println("Informe a marca: ");
        carro1.setMarca(teclado.nextLine());

        System.out.println("Modelo: ");
        carro1.setModelo(teclado.nextLine());

        System.out.println("Ano: ");
        carro1.setAnoFabricacao(teclado.nextInt());

        carro1.exibirCarro();

        Carro carro2 = new Carro("Fiat", "Stilo", 2006);

        carro2.exibirCarro();

        
        teclado.close(); 
    }
    
}
