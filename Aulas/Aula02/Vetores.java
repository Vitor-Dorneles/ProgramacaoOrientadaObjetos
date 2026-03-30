package Aulas.Aula02;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[5]; //int vetor [5];
        vetor[0] = 1;
        vetor[1] = 10;
        vetor[2] = 20;
        vetor[3] = 30;
        vetor[4] = 40;


        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o elemento "+i+":");
            vetor[i] = teclado.nextInt();
        }

        for(int i = 0; i< vetor.length; i++){
            System.out.println("Elemento "+i+"="+vetor[i]);
        }   
        int [][] matriz = new int[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.println("Digite o elemento ["+i+"] ["+j+"]");
                matriz[i][j] = teclado.nextInt();

            }
        }
            System.out.print("Matriz ");
                for(int i=0; i<matriz.length; i++){
                    for(int j=0; j< matriz.length; j++){
                    System.out.print("["+matriz[i][j]+"]\t");
            }
            System.out.println();
        }

        teclado.close();
    }
    
}
