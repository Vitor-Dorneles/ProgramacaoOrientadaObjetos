
public class Filme {
    private String titulo;
    private String diretor;
    private int duracaoMinutos;
    private String genero;


    public Filme(String titulo, String diretor, int duracaoMinutos, String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracaoMinutos = duracaoMinutos;
        this.genero = genero;
    }

    public void exibirDetalhes() {
        System.out.println("\n");
        System.out.println("Detalhes do filme");
        System.out.println(this.titulo);
        System.out.println(this.diretor);
        System.out.println(this.duracaoMinutos);
        System.out.println(this.genero);

        ehlongo();
    }

    public boolean ehlongo() {
        if (this.duracaoMinutos > 120) {
            System.out.println("Filme é longo");
            return true;

        }
        System.out.println("Filme não é longo");
        return false;

    }





    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
