package Avaliacao01;

import java.util.Scanner;

public class AlunoDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno aluno = new Aluno("", 0);

        int opcao = -1;
        do {
            System.out.println("Menu Interativo:\n");
            System.out.println("1 - Criar aluno informando nome e nota");
            System.out.println("2 - Exibir informações do aluno ");
            System.out.println("3 - Atribuir nota");
            System.out.println("4 - Atribuir nome");
            System.out.println("5 - Obter nota");
            System.out.println("6 - Obter nome");
            System.out.println("7 - Verificar aprovação");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opçao:");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 0: 
                System.out.println("Saindo do Sistema");
                break;

                case 1:
                    System.out.println("Crie o cadastro do aluno, informe seu nome e sua nota ");
                    System.out.println("Nome: ");
                    aluno.setNome(teclado.nextLine());

                    System.out.println("Nota: ");
                    aluno.setNota(teclado.nextDouble());
                    break;
            
                case 2:
                    aluno.exibirInformacoes();
                    break;

                case 3:
                    System.out.println("Atribua nova nota substituta");
                    aluno.setNota(teclado.nextDouble());
                    String nomeTemp = aluno.getNome();
                    aluno.setNome(nomeTemp);
                    

                case 4:
                    System.out.println("Atribua novo nome substituto");
                    aluno.setNome(teclado.nextLine());
                    break;

                case 5:
                    System.out.println("Ultima nota atribuida: " + aluno.getNota());
                    break;

                case 6:
                    System.out.println("Ultimo aluno atribuido: " + aluno.getNome());
                    break;

                case 7: 
                aluno.aprovacao();

            }


        } while (opcao != 0);

        teclado.close();
    }
    
}
