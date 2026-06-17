package Aulas.Aula17Arquivos_Sereleziacao.Arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainEscritaArquivo {
    public static void main(String[] args) {
        //Criando objetos Aluno
        Aluno aluno1 = new Aluno("Vitor", 20);
        Aluno aluno2 = new Aluno("main", 19);
        Aluno aluno3 = new Aluno("Sab", 20);

        //Escrevendo os alunos em um arquivo de texto
        try{
            FileWriter arquivo = new FileWriter("Aulas/Aula17Arquivos_Sereleziacao/Arquivo/alunos.txt");
            BufferedWriter escritor = new BufferedWriter(arquivo);

            // Escrevendo os alunos no arquivo
            escritor.write(aluno1.getNome()+ "," + aluno1.getIdade());
            escritor.newLine();

            escritor.write(aluno2.getNome()+ "," + aluno2.getIdade());
            escritor.newLine();

            escritor.write(aluno3.getNome()+ "," + aluno3.getIdade());
            escritor.newLine();

            escritor.close();
            arquivo.close();

            System.out.println("Alunos salvos no arquivo alunos.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Lendo os alunos do arquivo

        try {
            FileReader arquivo = new FileReader("Aulas/Aula17Arquivos/alunos.txt");
            BufferedReader leitor = new BufferedReader(arquivo);

            System.out.println("Alunos lidos do arquivo: ");
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] camposLeitura = linha.split(",");

                String nome = camposLeitura[0];
                int idade = Integer.parseInt(camposLeitura[1]);

                Aluno aluno = new Aluno(nome, idade);

                System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
            }

            leitor.close();
            arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
