import java.util.Scanner;

public class FilmeDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite os dados de seu filme: ");
        System.out.println("Titulo:");
        String titulo = teclado.nextLine();

        System.out.println("Diretor: ");
        String diretor = teclado.nextLine();

        System.out.println("Genero do filme");
        String genero = teclado.nextLine();

        System.out.println("Duração do filme em minutos");
        int duracao = teclado.nextInt();

        Filme filmeTeste = new Filme(titulo, diretor, duracao, genero);

        filmeTeste.exibirDetalhes();
        

        teclado.close();
    }
    
}
