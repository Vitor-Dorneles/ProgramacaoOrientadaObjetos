package Aulas.Aula03.ExsRevisao;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = qtd;
    }

    public void exibirInformacoes() {
        System.out.println("Dados do produto: ");
        System.out.println(this.nome);
        System.out.println(this.preco);
        System.out.println(this.quantidadeEmEstoque);
        System.out.println(valorTotalEstoque());
    }


    public double valorTotalEstoque() {
        return this.preco * this.quantidadeEmEstoque;
    }





    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }


    
    
}
