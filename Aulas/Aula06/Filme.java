package Aulas.Aula06;

public class Filme {
    String titulo;
    int duracao;
    int classificacaoEtaria;

    public Filme(String titulo, int duracao, int classificacaoEtaria) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public double converterDuracaoHoras() {
        return (double) duracao / 60;
    }

    public boolean podeAssistir(int idade) {
        return idade >= classificacaoEtaria;
    }

    public String descricaoFilme() {
        return "Título: " + titulo +
                " \t Duração: " + duracao + " min (" + converterDuracaoHoras() + "h)" +
                " \n Classificação: " + classificacaoEtaria + " anos";
    }
    
}
