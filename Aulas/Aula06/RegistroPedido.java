package Aulas.Aula06;

import java.util.Scanner;

public class RegistroPedido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Número do pedido: ");
        int numero = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Produto: ");
        String produto = teclado.nextLine();

        System.out.print("Preço: ");
        double preco = teclado.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = teclado.nextInt();

        System.out.print("Percentual desconto: ");
        double detecladoonto = teclado.nextDouble();

        Pedido pedido = new Pedido(numero, produto, preco, quantidade);

        System.out.println(pedido.resumoPedido());
        System.out.println("Detecladoonto: R$ " + pedido.calcularDesconto(detecladoonto));
        System.out.println("Total: R$ " + pedido.calcularTotal(detecladoonto));

        teclado.close();
    }
}
