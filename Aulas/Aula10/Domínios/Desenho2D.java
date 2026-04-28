package Domínios;

public class Desenho2D extends Desenho {
    private int altura;
    private int largura;

    public Desenho2D(String nomeAutor, String descricao, int altura, int largura) {
        super(nomeAutor, descricao);
        this.altura = altura;
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
    
}
