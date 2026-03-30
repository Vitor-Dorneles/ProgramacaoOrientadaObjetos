package Aulas.Aula03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno a1 = new Aluno();
        a1.nome = "vitor";
        a1.cpf = "78788878";
        a1.matricula = "787480";
        System.out.println("Aluno instanciado");
        System.out.println("Nome: "+a1.nome);
        System.out.println("Matricula: "+a1.matricula);
        System.out.println("CPF: "+a1.cpf);

        Aluno a2 = new Aluno();
        a2.nome = "Gabriel";
        a2.cpf = "45487";
        a2.matricula = "459989";
        System.out.println("\nAluno 2 instanciado");
        System.out.println("Nome: "+a2.nome);
        System.out.println("Matricula: "+a2.matricula);
        System.out.println("CPF: "+a2.cpf);


        int i = 0;
        int n = 4;
        Aluno[] a = new Aluno[n];
        
        do {
            a[i] = new Aluno();
        System.out.println("\nInforme o " +(i+1)+ " º Aluno");


        System.out.println("Nome: ");
        a[i].nome = teclado.nextLine();

        System.out.println("Matricula: ");
        a[i].matricula = teclado.nextLine();

        System.out.println("CPF: ");
        a[i].cpf = teclado.nextLine();
        
        System.out.println("Idade: ");
        a[i].idade = teclado.nextInt();
        i++;
        } while(i<=n);




        teclado.close();
    }
    
}
