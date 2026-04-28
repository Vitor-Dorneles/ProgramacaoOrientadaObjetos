package Domínios;

public class Carro {
    protected String nome; // um atributo protegido é visisvel na sua propria classe e também nas classes filhas


    public void exibirDados() {
        System.out.println("Dentro da classe carro");
        System.out.println(this.nome);
} 



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}