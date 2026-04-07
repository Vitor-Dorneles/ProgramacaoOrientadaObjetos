import java.util.Scanner;

public class CalculoNotasAluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno NovoAluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        NovoAluno.setNome(nome);

        System.out.println("Digite sua primeira nota: ");
        //double nota1 = teclado.nextDouble();
        NovoAluno.setNota1(teclado.nextDouble());

        System.out.println("Digite sua segunda nota: ");
        NovoAluno.setNota2(teclado.nextDouble());

        System.out.println("Sua média é: " + NovoAluno.CalculaMedia());

        teclado.close();
    }    
}
