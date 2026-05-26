public class Produto {
    protected String produto;
    protected double preco;

    public Produto(String produto, double preco) {
        this.preco = preco;
        this.produto = produto;
    }

    public double desconto10(double preco) {
        return preco - (preco * 0.10);
        
    }
    
}
