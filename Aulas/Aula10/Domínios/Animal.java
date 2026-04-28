package Domínios;

public class Animal {
    protected String nome;
    protected int idade;
    protected String som;

    public void exibirDados() {
        System.out.println("Dados do Animal");
        System.out.println(this.nome);
        System.out.println(this.idade);
}


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSom() {
        return som;
    }
    public void setSom(String som) {
        this.som = som;
    }
}
