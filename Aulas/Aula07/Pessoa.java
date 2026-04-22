// Data: 07/04/2026
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome; // "this" se refere ao elemento da classe
        //this.idade = idade;
        this.setIdade(idade); //usando nossa validação
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.err.println("Nome inválido");
        } else {
            this.nome = nome;
        }
    }
    
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Impossivel atribuir idade");
            System.err.println("Idade inválida");            
        } else {
            this.idade = idade;
        }
    }
}