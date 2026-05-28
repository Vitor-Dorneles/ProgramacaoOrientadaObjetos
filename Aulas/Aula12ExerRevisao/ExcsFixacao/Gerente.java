package Aulas.Aula12ExerRevisao.ExcsFixacao;

public class Gerente extends Funcionario {
    private double bonusAnual;

    public Gerente(String nome, double salario, double bonusAnual) {
        super(nome, salario); //chamando o construtor da classe principal

        this.bonusAnual = bonusAnual;
    }

    @Override
    public void aumentarSalario(double porcentagem) {
        this.salario += (this.salario * (porcentagem / 100)) + this.bonusAnual;
    }
    
    @Override
    public String toString() {
        //super.toString() traz o texto da classe funcionario
        return super.toString() + " Bonus: R$" + this.bonusAnual;
    }
}
