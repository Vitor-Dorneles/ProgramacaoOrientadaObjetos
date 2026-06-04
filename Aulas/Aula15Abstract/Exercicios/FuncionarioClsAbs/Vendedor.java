package Aulas.Aula15Abstract.Exercicios.FuncionarioClsAbs;

public class Vendedor extends Funcionario {
    
    public final double  COMISSAO = 250.00;

    @Override
    public void calcularSalario() {
        System.out.println("Dentro da classe vendedor, seu salario é:");
        salario = this.salario + COMISSAO;
        System.out.println(this.salario);
    }

    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.salario = 1500.50;

        v.calcularSalario();
    }
    
}
