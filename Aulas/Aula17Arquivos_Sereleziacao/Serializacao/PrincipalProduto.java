package Aulas.Aula17Arquivos_Sereleziacao.Serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PrincipalProduto {
    public static void main(String[] args) {
    Produto produto = new Produto("ABC123", "calca", 
            415, "Campo temporario");

    //Serialização
    try {
        FileOutputStream arquivoSaida = new FileOutputStream("Aulas/Aula17Arquivos_Sereleziacao/Serializacao/produto.ser");
        ObjectOutputStream objetoSaida = new ObjectOutputStream(arquivoSaida);

        objetoSaida.writeObject(produto);
        objetoSaida.close();
        arquivoSaida.close();

        System.out.println("Objeto serializado e salvo em produto.ser");
              
    } catch (IOException e) {
        e.printStackTrace();
    }
        
    // Desserialização
    try {
        FileInputStream arquivoEntrada = new FileInputStream("Aulas/Aula17Arquivos_Sereleziacao/Serializacao/produto.ser");
        ObjectInputStream objetoEntrada = new ObjectInputStream(arquivoEntrada);

        Produto produtoDesserializado = (Produto) objetoEntrada.readObject();
        objetoEntrada.close();
        arquivoEntrada.close();


        System.out.println("Objeto desserializado: " + produtoDesserializado); // chama o método sobreescrito toString();
        System.out.println("Vai apresentar null: " + produtoDesserializado.getTemporario());
        
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    }
    
}
