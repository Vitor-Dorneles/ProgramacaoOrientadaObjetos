package Domínios;

public class DesenhoQuadrado extends Desenho2D {
    private int lado1;
    private int lado2;
    protected String desc;

    public DesenhoQuadrado(String nomeAutor, String descricao, int largura, int altura, int lado1, int lado2, String desc) {
        super(nomeAutor, descricao, altura, largura);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.desc = descricao;
    }

    public void exibeDados() {
        System.out.println("\n\n");
        System.out.println(this.nomeAutor);
        System.out.println(this.descricao);
        System.out.println(this.getLargura());
        System.out.println(getAltura());
        System.out.println(this.lado1);
        System.out.println(this.lado2);
        System.out.println(this.desc);
    }
    
}
