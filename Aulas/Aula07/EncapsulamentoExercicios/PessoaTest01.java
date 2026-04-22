import java.util.Scanner;

public class PessoaTest01 {
    private String nome;
    private int idade;
    private String cpf;

    public PessoaTest01() {
    }

    public PessoaTest01(String nome, int idade, String cpf) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.err.println("Idade inválida");
        } else {
            this.idade = idade;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank() || cpf.isEmpty()) {
            System.err.println("CPF inválido");
        } else {
            this.cpf = cpf;
        }
    }

    public boolean verificaMaiorDeIdade() {
        return this.idade >= 18;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = teclado.nextLine();

        System.out.print("Informe a idade: ");
        int idade = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Informe o CPF: ");
        String cpf = teclado.nextLine();

        PessoaTest01 pessoa = new PessoaTest01(nome, idade, cpf);

        if (pessoa.verificaMaiorDeIdade()) {
            System.out.println(pessoa.getNome() + " é maior de idade");
        } else {
            System.out.println(pessoa.getNome() + " não é maior de idade");
        }

        teclado.close();
    }
}
