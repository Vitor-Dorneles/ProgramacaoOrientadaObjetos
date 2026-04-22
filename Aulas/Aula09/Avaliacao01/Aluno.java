package Avaliacao01;

public class Aluno {
    private String nome;
    private double nota;
    
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

public void exibirInformacoes() {
    System.out.println("Menu exibição");
    System.out.println("Nome do aluno: " + this.nome);
    System.out.println("Sua nota: " + this.nota);
}

public void aprovacao() {
    if (this.nota >= 7) {
        System.out.println("Aprovado");
        return;
    } else {
        if (this.nota < 7) {
            System.out.println("Reprovado");
            return;
        }
    }
}

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
}