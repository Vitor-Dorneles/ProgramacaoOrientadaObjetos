package Aulas.Aula17Arquivos_Sereleziacao.Arquivo;

import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {
    public static void main(String[] args) {
        //Criando objetos para teste do arquivo generico

        Aluno aluno1 = new Aluno("João", 15);
        Aluno aluno2 = new Aluno("Flavio", 78);
        Aluno aluno3 = new Aluno("Tadeu", 74);

        List<Aluno> lista = new ArrayList<>();
        ArquivoGenerico arquivo = new ArquivoGenerico("alunos");
        arquivo.gravarArquivo(aluno1);
        arquivo.gravarArquivo(aluno2);
        arquivo.gravarArquivo(aluno3);

        lista = arquivo.lerArquivo();

        for (Aluno a : lista) {
            System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade());
        }
    }
}