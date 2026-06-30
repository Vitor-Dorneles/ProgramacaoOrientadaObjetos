package Aulas.Aula19Avaliacao03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Livro> listaDeLivros = new ArrayList<>();
    private Scanner teclado = new Scanner(System.in);





    public String pegarCaminho() {
        System.out.println("Crie um arquivo txt e Informe o caminho relativo de seu arquivo: ex: (seu\\caminho\\livros.txt)");
        String caminho = teclado.nextLine();
        return caminho;
    }

    public void carregarArquivo(String nomeArquivo) {
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader leitor = new BufferedReader(arquivo);

            System.out.println("Livros no arquivo: ");
            String linha;
            int total = 0;
                while ((linha = leitor.readLine()) != null) {

                    String[] campos = linha.split(",");
                    if (campos.length == 4) {
                        String titulo = campos[0];
                        String autor = campos[1];
                        int anoPublicacao = Integer.parseInt(campos[2]);
                        boolean emprestado = Boolean.parseBoolean(campos[3]);

                        Livro livroLido = new Livro(titulo, autor, anoPublicacao, emprestado);

                        System.out.println(livroLido.toString());
                        total += 1;
                        adicionarLivro(livroLido);
                    }
                }
                if (total == 0) {
                    System.out.println("Nenhum livro no arquivo, adicione");
            }
            
            leitor.close();
            arquivo.close();
        } catch (IOException e) {
            System.out.println("Nenhum dado encontrado");
            e.printStackTrace();
        }
    }

    
    public void adicionarLivro(Livro livrinho) {
        System.out.println("\nAdicionando Livro ...");
        listaDeLivros.add(livrinho);
            System.out.println("Livro adicionado");
    }

    public void salvarArquivo(String nomeArquivo) {
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo);
            BufferedWriter escritor = new BufferedWriter(arquivo);

            
            for (Livro livrinho : listaDeLivros) {
                
                    escritor.write(
                            livrinho.getTitulo() + "," + livrinho.getAutor() + "," + livrinho.getAnoPublicado() + ","
                                    + livrinho.isEmprestado());
                    escritor.newLine();
                }
            
            escritor.close();
            arquivo.close();
            System.out.println("Arquivo atualizado");
        } catch (IOException e) {
            System.out.println("Erro ao salvar");
            e.printStackTrace();
        }
    }
   
    
    public void listarLivros() {
        int total = 0;
        for (Livro l : listaDeLivros) {
            System.out.println(l.toString());
            total += 1;
        }
        System.out.println("Total de livros: " + total);
    }

    public void exibirMenu() {
        int opcao = -1;
        String caminho = pegarCaminho();
        carregarArquivo(caminho);
        while (true) {
            System.out.println("\tMENU PRINCIPAL\n");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Listar livros");
            System.out.println("0. Sair do sistema");
            System.out.print("Escolha uma opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Informe  titulo do seu livro:");
                    String titulo = teclado.nextLine();
                    System.out.println("informe o autor do seu livro:"); 
                    String autor = teclado.nextLine();
                    boolean livroExistente = false;
                    for (Livro l : listaDeLivros) {
                        if (l.getTitulo().equalsIgnoreCase(titulo) && l.getAutor().equalsIgnoreCase(autor)) {
                            livroExistente = true;
                            break;
                        }
                    }
                    if (livroExistente) {
                        System.out.println("Já existe esse livro cadastrado no sistema");
                        break;
                    }

                    System.out.print("Informe o ano de publicação: ");
                    int anoPublicacao = teclado.nextInt();
                    teclado.nextLine();

                    System.out.print("Informe se está emprestado: (true/false)");
                    boolean emprestado = teclado.nextBoolean();
                    teclado.nextLine();

                    Livro novoLivro = new Livro(titulo, autor, anoPublicacao, emprestado);
                    adicionarLivro(novoLivro);
                    salvarArquivo(caminho);                   
                    break;
                case 2:
                    System.out.println("Listando livros:");
                    listarLivros();
                    
                    break;
                case 0:
                    System.out.println("\nSaindo do sistema");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção inválida.");
            }
        }
    }
}
