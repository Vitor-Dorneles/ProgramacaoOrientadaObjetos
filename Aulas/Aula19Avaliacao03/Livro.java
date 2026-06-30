package Aulas.Aula19Avaliacao03;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado;
    private boolean emprestado;


    public Livro(String titulo, String autor, int anoPublicado, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        
        return ("Titulo: " + this.getTitulo() + ", Autor: " + this.getAutor()
                            + ", Ano Publicado: " + this.getAnoPublicado() + ", Emprestado: "
                + this.emprestado);
        
    }









    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getAnoPublicado() {
        return anoPublicado;
    }


    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }


    public boolean isEmprestado() {
        return emprestado;
    }


    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    
}