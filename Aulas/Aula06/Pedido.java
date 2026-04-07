package Aulas.Aula06;

public class Pedido {
    int numero;
    String produto;
    double preco;
    int quantidade;

    public Pedido(int numero, String produto, double preco, int quantidade) {
        this.numero = numero;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return preco * quantidade;
    }

    public double calcularDesconto(double percentual) {
        return calcularSubtotal() * (percentual / 100);
    }

    public double calcularTotal(double percentualDesconto) {
        return calcularSubtotal() - calcularDesconto(percentualDesconto);
    }

    public String resumoPedido() {
        return "Pedido " + numero + " \n Produto: " + produto +
                " \n Quantidade: " + quantidade +
                " \n Subtotal: R$ " + calcularSubtotal();
    }
    
}
