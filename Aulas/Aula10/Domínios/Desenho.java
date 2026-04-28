package Domínios;

public class Desenho {
    protected String nomeAutor;
    protected String descricao;

    public Desenho(String nomeAutor, String descricao) {
        this.nomeAutor = nomeAutor;
        this.descricao = descricao;
    }


    

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
