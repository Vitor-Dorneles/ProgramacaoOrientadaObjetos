import java.util.Scanner;

public class ProdutoExibicao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        System.out.println("Digite os dados do seu produto \n");
        System.out.println("Nome: ");
        produto1.nome = teclado.nextLine();
        System.out.println("Preço: ");
        produto1.preco = teclado.nextDouble();
        System.out.println("Quantidade em estoque: ");
        produto1.quantidade = teclado.nextInt();
        teclado.nextLine();

        

        System.out.println("Exibir informações");
        produto1.exibirInformacoes();
        System.out.println("Valor total em estoque: " + produto1.CalcularValorTotal());


        System.out.println("\n\nProduto 02: ");
        produto2.nome = "Arroz 5kg";
        produto2.preco = 20;
        produto2.quantidade = 5;

        produto2.exibirInformacoes();
        System.out.println("Valor total em estoque: " + produto2.CalcularValorTotal());

        teclado.close();
    }
    
}
