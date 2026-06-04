package Aulas.Aula15Abstract.Exercicios.FuncionarioClsAbs;

public class Gerente extends Funcionario {

    public final double BONUS = 1000.00;

    @Override
    public void calcularSalario() {
        System.out.println("Dentro da classe gerente, seu salario é:");
        salario = this.salario + BONUS;
        System.out.println(this.salario);
    }

    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.salario = 1500.50;

        v.calcularSalario();

        Gerente g = new Gerente();
        g.salario = 2000;
        g.calcularSalario();
    }
    
}
