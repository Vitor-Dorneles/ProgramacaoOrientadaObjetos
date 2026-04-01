// 1 - Crie uma classe chamada Produto com os atributos nome, preco e quantidade. Crie um construtor que inicialize esses atributos. Implemente os métodos calcularValorTotalEstoque(), que deve retornar o valor total do estoque (preço multiplicado pela quantidade), temEstoque(), que retorna true se a quantidade for maior que zero, adicionarEstoque(int quantidade), que adiciona produtos ao estoque, e vender(int quantidade), que diminui a quantidade em estoque apenas se houver produtos suficientes, retornando true caso a venda seja realizada e false caso contrário.
package Aulas.Aula06;

import java.util.Scanner;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double calcularValorTotalEstoque() {
        return this.preco * this.quantidade; // total do estoque
    }

    public boolean vender(int quantidadeVenda) { //boolean para retornar true ou false
        if (this.quantidade >= quantidadeVenda) {
            this.quantidade -= quantidadeVenda; //this.quantidade é o objeto , this.quantidade = this.quantidade - quantidadeVenda
            return true;
        }
        return false;
    }
        
    public void adicionarEstoque(int quantidadeAdicionada) { //não retorna nada mas adiciona no objeto
        this.quantidade += quantidadeAdicionada;
    }
        
    public boolean temEstoque() {
        return this.quantidade > 0; //retorna true apenas se a quantidade for maior que zero
    }
        
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Produto produto = new Produto("Lapiseira", 2.5, 10);

        System.out.println("Produto: " + produto.nome);
        System.out.println("Estoque atual: " + produto.quantidade);
        System.out.println("Valor em estoque: " + produto.calcularValorTotalEstoque());

        System.out.print("Informe a quantidade para adicionar ao estoque: ");
        int qtdAdicionar = teclado.nextInt();
        produto.adicionarEstoque(qtdAdicionar);

        System.out.print("Quantidade para vender: ");
        int qtdVender = teclado.nextInt();
        boolean vendeu = produto.vender(qtdVender);

        System.out.println("Venda realizada? " + vendeu);
        System.out.println("Sobrou estoque? " + produto.temEstoque());
        System.out.println("Estoque final: " + produto.quantidade);
        System.out.println("Novo valor total em estoque: " + produto.calcularValorTotalEstoque());

        teclado.close();
    }
}