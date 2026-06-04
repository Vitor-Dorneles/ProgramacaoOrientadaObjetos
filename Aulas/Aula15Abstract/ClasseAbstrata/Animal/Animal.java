package Aulas.Aula15Abstract.ClasseAbstrata.Animal;

public abstract class Animal {
	public String especie;
	public int idade;

	public abstract void emiteSom();
	
	public void exibeInfo() {
		System.out.println("Especie: " + especie);
		System.out.println("Idade: " + idade);
	}

}
