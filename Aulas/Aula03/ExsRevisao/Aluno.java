package Aulas.Aula03.ExsRevisao;

public class Aluno {
    public String nome;
    public int matricula;
    public double nota01;
    public double nota02;
    public double nota03;

    public double MediaNotas(double nota01, double nota02, double nota03) {
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;

        double Media = (nota01 + nota02 + nota03) / 3;

        return Media;
    }

    public boolean Aprovacao(double Media) {
        if (Media < 6) { 
            System.out.println("Aluno reprovado");
            return false;         
        }

        return true;
    }
    
}