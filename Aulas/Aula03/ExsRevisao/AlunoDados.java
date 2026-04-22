package Aulas.Aula03.ExsRevisao;

import java.util.Scanner;

public class AlunoDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno estudante = new Aluno();

        System.out.println("Informe os dados do aluno, \n Seu nome, matricula, notas 1,2,3");
        estudante.nome = teclado.nextLine();
        estudante.matricula = teclado.nextInt();
        teclado.nextLine();
        estudante.nota01 = teclado.nextDouble();
        estudante.nota02 = teclado.nextDouble();
        estudante.nota03 = teclado.nextDouble();

        double media = estudante.MediaNotas(estudante.nota01, estudante.nota02, estudante.nota03);

        System.out.println("A media do Estudante foi:" + estudante.nome + " " + estudante.matricula + "\n" + media);
        System.out.println(estudante.Aprovacao(media));
        teclado.close();
    }
    
}
