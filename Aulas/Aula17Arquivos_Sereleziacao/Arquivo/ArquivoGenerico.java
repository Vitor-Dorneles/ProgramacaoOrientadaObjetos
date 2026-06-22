package Aulas.Aula17Arquivos_Sereleziacao.Arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//objetivo dessa classe é ser um manipulador de arquivos diverso, sendo possivel reutilizar para o que for necessário

public class ArquivoGenerico {
    private FileWriter arqW;
    private BufferedWriter escritor;
    private FileReader arqR;
    private BufferedReader leitor;
    private List<Aluno> listAlunos;
    public String nomeArquivo;

    public ArquivoGenerico(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        listAlunos = new ArrayList<>();
    }

    public void gravarArquivo(Aluno a) {
        //escrevendo os alunos em um arquivo de texto
        try {
            //Escrevendo os alunos no arquivo
            arqW = new FileWriter(nomeArquivo + ".txt", true); //abrindo o arquivo
            escritor = new BufferedWriter(arqW);

            escritor.write(a.getNome() + "," + a.getIdade());
            escritor.close();
            arqW.close(); //salvando

            System.out.println("Alunos salvos no arquivo alunos.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public List<Aluno> lerArquivo() {
        //lendo os alunos do arquivo

        System.out.println("\n Alunos lidos do arquivo: ");
        try {
            arqR = new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqR);
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(",");

                String nome = campos[0];
                int idade = Integer.parseInt(campos[1]);

                Aluno aluno = new Aluno(nome, idade);
                listAlunos.add(aluno);
            }
            leitor.close();
            arqR.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listAlunos;
    }
}
