package Aulas.Aula12ExerRevisao.ExcsFixacao.Locadora;

// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

public class PrincipalLocadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Locadora locadora = new Locadora();
        Carro carro = new Carro("Fiat", 100, 4);
        Moto moto = new Moto("Honda", 136, true);

        System.out.println("Vamos criar um carro");
        System.out.println("Adicione sua marca");
        String marca = teclado.nextLine();
        System.out.println("Seu topSpeed");
        double maxvelocidade = teclado.nextDouble();
        System.out.println("Numero de portas");
        int portas = teclado.nextInt();

        Carro carro2 = new Carro(marca, maxvelocidade, portas);

        // carro.exibirInfo();
        // carro2.exibirInfo();
        // moto.exibirInfo();

        locadora.adicionarVeiculo(carro2);
        locadora.adicionarVeiculo(carro);
        locadora.adicionarVeiculo(moto);

        // List<Veiculo> frota = new ArrayList<>();

        //locadora.listarFrota();
        Veiculo maisRapido = locadora.veiculoMaisRapido();
        System.out.println("Veículo mais rápido:");
        maisRapido.exibirInfo();


        // sobrecarga — diária fixa de R$100
        System.out.println("Custo (diária fixa): " + carro.calcularCustoLocacao(5));

        // sobrecarga — diária customizada
        System.out.println("Custo (diária custom): " + carro.calcularCustoLocacao(5, 150.0));



        teclado.close();
}
}
