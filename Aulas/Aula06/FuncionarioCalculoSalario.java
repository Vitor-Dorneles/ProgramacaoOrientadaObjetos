package Aulas.Aula06;

import java.util.Scanner;

public class FuncionarioCalculoSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Salário: ");
        double salario = teclado.nextDouble();

        System.out.print("Horas extras: ");
        int horasExtras = teclado.nextInt();

        Funcionario f = new Funcionario(nome, salario, horasExtras);

        System.out.println("Valor horas extras: R$ " + f.calcularValorHoraExtra());
        System.out.println("Pagamento total: R$ " + f.calcularPagamentoTotal());
        System.out.println("Salário anual: R$ " + f.salarioAnual());

        System.out.print("Adicionar mais horas extras: ");
        int maisHoras = teclado.nextInt();
        f.adicionarHorasExtras(maisHoras);
        System.out.println("Novo pagamento total: R$ " + f.calcularPagamentoTotal());

        teclado.close();
    }
    
}
