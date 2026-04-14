import java.util.Scanner;

public class RetanguloEx {
    private int x;
    private int y;

    public RetanguloEx(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x <= 0) {
            System.err.println("Valor de x inválido");
        } else {
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y <= 0) {
            System.err.println("Valor de y inválido");
        } else {
            this.y = y;
        }
    }

    public void inserir_lados(int a, int b) {
        this.setX(a);
        this.setY(b);
    }

    public void calcular_area() {
        System.out.println("Área do retângulo: " + (this.x * this.y));
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o lado A do retângulo: ");
        int a = teclado.nextInt();

        System.out.print("Informe o lado B do retângulo: ");
        int b = teclado.nextInt();

        RetanguloEx retangulo = new RetanguloEx(a, b);
        retangulo.calcular_area();

        teclado.close();
    }
}