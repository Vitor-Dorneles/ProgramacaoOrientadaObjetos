package Aulas.Aula06;

import java.util.Scanner;

public class RegistroFilme {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Título: ");
        String titulo = teclado.nextLine();

        System.out.print("Duração (minutos): ");
        int duracao = teclado.nextInt();

        System.out.print("Classificação etária: ");
        int classificacao = teclado.nextInt();

        System.out.print("Idade do espectador: ");
        int idade = teclado.nextInt();

        Filme filme = new Filme(titulo, duracao, classificacao);

        System.out.println(filme.descricaoFilme());
        System.out.println("Pode assistir: " + filme.podeAssistir(idade));

        teclado.close();
    }
    
}
