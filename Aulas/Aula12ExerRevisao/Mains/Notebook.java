import java.util.Scanner;

public class Notebook extends Computador {

    public Notebook() {
        super("Portátil");
    }

    public String exibeMarca() {
        return "Marca do Notebook: " + this.marca;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Notebook a = new Notebook();

        System.out.println("Insira a Marca do notebook");
        a.setMarca(teclado.nextLine());

        a.exibeModelo();
        teclado.close();
    }
    
}
