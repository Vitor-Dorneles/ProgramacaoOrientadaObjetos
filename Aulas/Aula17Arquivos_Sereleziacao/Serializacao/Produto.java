package Aulas.Aula17Arquivos_Sereleziacao.Serializacao;

import java.io.Serializable;

public class Produto implements Serializable{
    private String codigo;
    private String nome;
    private double preco;
    private transient String temporario;

    public Produto(String codigo, String nome, double preco, String temporario) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.temporario = temporario;
    }


    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTemporario() {
        return temporario;
    }

    public void setTemporario(String temporario) {
        this.temporario = temporario;
    }

    
}
