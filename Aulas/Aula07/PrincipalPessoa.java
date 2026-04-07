public class PrincipalPessoa {
    public static void main(String[] args) {
        //Pessoa p = new Pessoa();
        //p.nome = "Ricardo";
        //p.idade = "46";

        Pessoa p = new Pessoa("Ricardo", 40);
        /*String nome;
        nome = p.getNome(); // neste método retorna uma string com o nome
        System.out.println("Nome: " + nome); */
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());

    }
    
}
