package Aulas.Aula03.ExsRevisao;

import java.util.Scanner;

public class ProdutoDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto(null, 0, 0);

        System.out.println("Informe os dados do produto; ");
        System.out.println("Nome: ");
        produto.setNome(teclado.nextLine());
        System.out.println("Preco: ");
        produto.setPreco(teclado.nextDouble());
        System.out.println("Quantidade em estoque: ");
        produto.setQuantidadeEmEstoque(teclado.nextInt());

        produto.exibirInformacoes();


        teclado.close();
    }
    
}
