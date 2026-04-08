/*Crie uma classe Aluno que possua os atributos nome, nota1 e nota2.
• Proteja os atributos utilizando encapsulamento. 
• Crie os métodos get e set para cada atributo. 
• Crie um método calculaMedia que calcule a média das notas do aluno e 
retorne o resultado.
Resolução*/

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno() {
    }

    public Aluno(String nome, double nota1, double nota2) {
        this.setNome(nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank() || nome.isEmpty()) {
            System.err.println("Nome inválido");
        } else {
            this.nome = nome;
        }
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double CalculaMedia() {
        return (this.nota1 + this.nota2) / 2;
    }
}
