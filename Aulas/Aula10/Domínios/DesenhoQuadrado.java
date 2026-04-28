package Domínios;

public class DesenhoQuadrado extends Desenho2D {
    protected String desc;

    public DesenhoQuadrado(String nomeAutor, String descricao, int largura, int altura, String desc) {
        super(nomeAutor, descricao, altura, largura);
        this.desc = descricao;
    }

    public void exibeDados() {
        System.out.println("\n\n");
        System.out.println(this.nomeAutor);
        System.out.println(this.descricao);
        System.out.println(this.getLargura());
        System.out.println(getAltura());
        System.out.println(this.desc);
    }
    
}
