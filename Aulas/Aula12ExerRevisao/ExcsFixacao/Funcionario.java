package Aulas.Aula12ExerRevisao.ExcsFixacao;

// Crie uma classe base Funcionario com atributos como nome e salario. Derive classes específicas como Gerente e Desenvolvedor.Gerente possui um bônus anual,enquanto Desenvolvedor tem horas extras.""Implemente métodos sobrecarregados aumentarSalario que aumentam o salário baseado em diferentes critérios (porcentagem fixa para todos e uma porcentagem adicional para Gerente que considera o bônus).""Sobrescreva o método toString para refletir informações específicas de cada tipo de funcionário.""Crie um array de Funcionario que inclua Gerente e Desenvolvedor, e demonstre a aplicação dos aumentos de salário e a impressão das informações

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario += this.salario * (porcentagem / 100);
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + " Salário: R$" + this.salario;
    }
}
