package Aulas.Aula12ExerRevisao.ExcsFixacao;

public class Principal {
    public static void main(String[] args) {
        // criando o array da superclasse e adicionando sub-classes
        Funcionario[] funcionarios = new Funcionario[3]; //encontro de polimorfismo e relação de classes
        // array do tipo da superClasse, que guardará objetos "gerente" e "desenvolvedor"
        funcionarios[0] = new Gerente("Fulano", 870, 100); //polimorfismo na prática
        funcionarios[1] = new Desenvolvedor("Ricardo", 11000, 50);
        funcionarios[2] = new Desenvolvedor("Ciclano", 2500, 10);

        for (Funcionario f : funcionarios) {
            f.aumentarSalario(10); //quando f aponta para um objeto "gerente" java chama o aumentar salario de gerente
            System.out.println(f.toString());
        }
    }
    
}
