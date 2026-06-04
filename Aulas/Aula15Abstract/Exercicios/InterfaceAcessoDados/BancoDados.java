package Aulas.Aula15Abstract.Exercicios.InterfaceAcessoDados;

public class BancoDados implements AcessoDados {

    public void conectar() {
        System.out.println("Conectando ao Banco");
    }

    public void atualizar() {
        System.out.println("Atualizando...");
    }

    public void desconectar() {
        System.out.println("Desconectando do banco");
    }

    public void inserir() {
        System.out.println("Inserindo dados no banco");
    }

    public void excluir() {
        System.out.println("Excluindo dados ...");
    }

    public static void main(String[] args) {
        BancoDados db = new BancoDados();
        db.conectar();
        db.atualizar();
        db.desconectar();

        AcessoDados db2 = new BancoDados();
        db2.inserir();
        db2.excluir();
    }
    
}
