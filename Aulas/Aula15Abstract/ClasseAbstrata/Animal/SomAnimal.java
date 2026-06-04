package Aulas.Aula15Abstract.ClasseAbstrata.Animal;
import java.util.Scanner;
public class SomAnimal  {
	public static void main(String[] args) {
		//Animal a = new Animal ();
		//Cachorro c = new Cachorro();
		//c.emiteSom();
		
		//Tigre t = new Tigre();
		//1 t.emiteSom();
		
		Scanner teclado = new Scanner(System.in);
		// Animal a; era um objeto padrão para ambos os animais
		int op;
		System.out.println("Digite: ");
		System.out.println("1 Para instanciar um cachorro ou ");
		System.out.println("2 para instanciar um tigre ");
		op = teclado.nextInt();
		
		if(op == 1) {
			Cachorro a = new Cachorro();
			a.especie = "Cuscus";
			a.idade = 10;
			a.raca = "Bergamota";
			a.cuidarPatio(true);
			a.emiteSom();
			a.exibeInfo();

		}
		else {
			Animal a = new Tigre();
			a.especie = "Tigrão";
			a.idade = 8;
			a.emiteSom();
			a.exibeInfo();
		}
		
		
		teclado.close();
	}

}
