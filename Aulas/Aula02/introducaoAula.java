package Aulas.Aula02;

import java.util.Scanner;

public class introducaoAula {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um inteiro:");
        int n = teclado.nextInt();
        System.out.println("Int digitado: "+n);

        System.out.println("Digite um double: ");
        double n1 = teclado.nextDouble();
        System.out.println("Double digitado: "+n1);
        teclado.nextLine(); // limpar o buffer

        System.out.println("Digite uma palavra: ");
        String palavra = teclado.nextLine();

        System.out.println("Palavra digitada:"+palavra);
        palavra=teclado.nextLine();
        System.out.println("String com next line: "+palavra);

        teclado.close();

        for(int i = 0; i<10; i++) {
            //o i existirá somente aqui dentro
            System.out.println("O i vale:"+i);
        }
        int i = 0; //inicializando
        while (i<10) { //critério de parada
            System.out.println("I vale com while: "+i);
            i++;//incremento
        }
        i=0;
        do {
            System.out.println("I com do while vale: "+i);
            i++;
        }while(i<10);
    }
    
}
