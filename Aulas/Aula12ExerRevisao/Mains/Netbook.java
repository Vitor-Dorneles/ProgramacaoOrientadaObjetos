import java.util.Scanner;

public class Netbook extends Computador {
    
    public Netbook() {
        super("Portátil");
    }

    public String exibeMarca() {
        return "Marca do Netbook" + this.marca;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Netbook b = new Netbook();

        System.out.println("Insira a marca do Netbook");
        b.setMarca(teclado.nextLine());

        System.out.println(b.exibeMarca());
        b.exibeModelo();



        teclado.close();
    }
    
}
