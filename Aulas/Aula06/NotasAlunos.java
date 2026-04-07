package Aulas.Aula06;

import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();

        System.out.println("Digite sua primeira nota: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = teclado.nextDouble();

        System.out.println("Digite suaterceira nota: ");
        double nota3 = teclado.nextDouble();


        Aluno NovoAluno = new Aluno(nome, nota1, nota2, nota3);

        System.out.println("Média: " + NovoAluno.calcularMedia());
        System.out.println("Aprovado: " + NovoAluno.aprovado());
        System.out.println("Maior nota: " + NovoAluno.maiorNota());
        System.out.println("Menor nota: " + NovoAluno.menorNota());

        teclado.close();
    }
    
}
