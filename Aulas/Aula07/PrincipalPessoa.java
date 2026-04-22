import java.util.Scanner;

public class PrincipalPessoa {
    public static void main(String[] args) {
        //Pessoa p = new Pessoa();
        //p.nome = "Ricardo";
        //p.idade = "46";
        Scanner teclado = new Scanner(System.in);

        Pessoa p = new  Pessoa("Ricardo", 0);
        /*String nome;
        nome = p.getNome(); // neste método retorna uma string com o nome
        System.out.println("Nome: " + nome); */
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());

        System.out.println("Digite o novo nome: ");
        String nome = teclado.nextLine();
        p.setNome(nome); //mudamos o nome
        System.out.println("Novo nome: " + p.getNome());

        System.out.println("Digite a nova idade: ");
        int idade = teclado.nextInt();

        p.setIdade(idade); //p.setIdade(teclado.nextInt()); pode ser feito dessa forma a leitura

        System.out.println("Nova idade: " + p.getIdade());


        teclado.close();

    }
    
}
