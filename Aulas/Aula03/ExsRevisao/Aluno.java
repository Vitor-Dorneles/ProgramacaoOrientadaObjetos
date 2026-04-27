package Aulas.Aula03.ExsRevisao;

public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;
    

    public Aluno(String nome, int matricula, double nota01, double nota02, double nota03) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[3];
        this.notas[0] = nota01;
        this.notas[1] = nota02;
        this.notas[2] = nota03;
    }


    public double mediaNotas() {
    return (this.notas[0] + this.notas[1] + this.notas[2]) / 3;
}

    public void aprovado() {
    double media = mediaNotas();
    if (media >= 6) {
        System.out.println("Aluno aprovado");
    } else {
        System.out.println("Aluno reprovado");
    }
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota(int indice) {
        return this.notas[indice];
    }

    public void setNota(int indice, double valor) {
        this.notas[indice] = valor;
    }
}
