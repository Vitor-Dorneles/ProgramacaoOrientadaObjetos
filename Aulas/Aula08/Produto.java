// Crie uma classe Produto com os atributos:
// nome(String)
// preco(double)
// quantidade(int)
// Implemente:
// Um método exibirInformacoes()que exibe os dados do produto
// Um método calcularValorTotal()que retorna o valor total em estoque(preço x quantidade)
// Na Main:// Crie dois produtos,sendo um com valores informados via teclado e outro com valores definidos no código// Exiba as informações e o valor total de cada produto
public class Produto {
    public String nome;
    public double preco;
    public int quantidade;


    public void exibirInformacoes() {
        System.out.println("--- Dados do Produto ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Quantidade em estoque: " + this.quantidade);
    }

    public double CalcularValorTotal() {
        double total = this.preco * this.quantidade;
        return total;        
    }
}
