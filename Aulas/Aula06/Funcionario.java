package Aulas.Aula06;

// 5-Crie uma classe chamada Funcionario com os atributos nome,salario e horasExtras.Crie um construtor que inicialize esses atributos.Implemente os métodos calcularValorHoraExtra(),considerando que cada hora extra vale 50 reais,calcularPagamentoTotal(),que retorna o salário mais o valor das horas extras,adicionarHorasExtras(int horas),que soma horas extras ao total atual,e salarioAnual(),que retorna o salário anual considerando apenas o salário base.

public class Funcionario {
    String nome;
    double salario;
    int horasExtras;

    public Funcionario(String nome, double salario, int horasExtras) {
        this.nome = nome;
        this.salario = salario;
        this.horasExtras = horasExtras;
    }

    public double calcularValorHoraExtra() {
        return horasExtras * 50;
    }

    public double calcularPagamentoTotal() {
        return salario + calcularValorHoraExtra();
    }

    public void adicionarHorasExtras(int horas) {
        horasExtras += horas;
    }

    public double salarioAnual() {
        return salario * 12;
    }

    
}
