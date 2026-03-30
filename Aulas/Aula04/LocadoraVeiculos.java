package Aulas.Aula04;

import java.util.Scanner;

public class LocadoraVeiculos {
    public static void main(String[] args) {
        Carro c = new Carro("vw", "toro");
        c.alugar();
        c.devolver();
        c.mostrar();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a marca do carro que deseja: ");
        c.marca = teclado.nextLine();

        System.out.println("Informe o modelo de carro: ");
        c.modelo = teclado.nextLine();

        c.mostrar();

        c.atribuicao("MacLaren", "GT" );
        c.mostrar();

        Moto moto1 = new Moto();
        // moto1.marca = "Honda";


        moto1.atribuirValor("Honda", "CG", "160");
        System.out.println(moto1.retornar());


    System.out.println("Informe a marca da moto: ");
    String marcaMoto = teclado.nextLine();

    System.out.println("Informe o modelo da moto: ");
    String modeloMoto = teclado.nextLine();

    System.out.println("Informe as cilindradas da moto: ");
    String cilindradasMoto = teclado.nextLine();

    moto1.atribuirValor(marcaMoto, modeloMoto, cilindradasMoto);
    System.out.println(moto1.retornar());

    Carro carro1 = new Carro("Fiat", "jeep");
    System.out.println("Marca do carro é: "+c.marca);

    String marca, modelo;
    System.out.println("Digite a marca do carro: ");
    marca = teclado.nextLine();
    System.out.println("Digite o modelo do carro: ");
    modelo = teclado.nextLine();
    Carro c2 = new Carro(marca,modelo);
    System.out.println("Marca do carro 2 é: "+ c2.marca);
    System.out.println("Modelo co carro 2 é: "+ c2.modelo);

    System.out.println("Digite a marca e o modelo do carro");
    Carro c3 = new Carro(teclado.nextLine(), teclado.nextLine());
    System.out.println("Marca do carro 3 é: "+c3.marca);
    System.out.println("Modelo do carro 3 é: "+c3.modelo);


    Carro c4 = new Carro("Ford");
    System.out.println("Marca do carro 4 é: "+ c4.marca);





        teclado.close();
    }
    
}
