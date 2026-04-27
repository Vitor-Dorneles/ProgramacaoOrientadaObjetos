package Aulas.Aula03.ExsRevisao;

import java.util.Scanner;

public class AlunoDados {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Aluno aluno = new Aluno(null, 0, 0, 0, 0);

    System.out.println("Informe os dados do aluno: ");
    System.out.println("Nome: ");
    aluno.setNome(teclado.nextLine());
    System.out.println("matricula: ");
    aluno.setMatricula(teclado.nextInt());
    System.out.println("Notas: ");
    
    for (int i = 0; i < 3; i++) {
        System.out.println("Informe a nota " + (i + 1) + " do aluno:");
        aluno.setNota(i, teclado.nextDouble());
    }

    System.out.println("Media: " + aluno.mediaNotas());
    aluno.aprovado();

    teclado.close();    
}
    
}
