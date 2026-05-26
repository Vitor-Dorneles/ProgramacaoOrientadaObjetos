package Aulas.Aula12ExerRevisao.ExcsFixacao;

public class Desenvolvedor extends Funcionario {
    private double horasExtras;

    public Desenvolvedor(String nome, double salario, double horasExtras) {
        super(nome, salario);
        this.horasExtras = horasExtras;
    }
    
    @Override
    public void aumentarSalario(double horasExtras) {
        this.salario += (this.salario * (horasExtras * 12)) + this.horasExtras;
    }

    @Override
    public String toString() {
        // super.toString() traz o texto da classe funcionario
        return super.toString() + " Bonus: R$" + this.horasExtras;
    }
}
