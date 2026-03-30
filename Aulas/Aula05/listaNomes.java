package Aulas.Aula05;

import java.util.Scanner;

public class listaNomes {
    //4 - Crie um array de Strings com 5 nomes de pessoas (ex: "Ana", "Carlos", etc.). 
    // Peça ao usuário para digitar um número de 0 a 4 para ver quem está naquela posição. Trate a exceção caso o usuário digite um índice que não existe (ex: 10 ou -1),
    //  usando ArrayIndexOutOfBoundsException. Trate também se ele digitar uma letra.
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos", "Maria", "João", "Luiza"};
        Scanner teclado = new Scanner(System.in);
        
        try {
            System.out.print("Digite um número de 0 a 4 para ver quem está naquela posição: ");
            String numeroUsuario = teclado.nextLine();
            int indice = Integer.parseInt(numeroUsuario);


            System.out.println("O nome na posição " + indice + " é: " + nomes[indice]);


        } catch (NumberFormatException e) { //caso digite uma letra
            System.out.println("Entrada inválida, digite um número.");
        } catch (ArrayIndexOutOfBoundsException e) { // caso digite um valor maior que o array
            System.out.println("Índice não encontrado no intervalo. "+ e.getMessage());
        }
            teclado.close();
        
    }
}
