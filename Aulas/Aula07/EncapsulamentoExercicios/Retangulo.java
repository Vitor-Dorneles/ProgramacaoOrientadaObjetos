import java.util.Scanner;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo() {
    }

    public Retangulo(double base, double altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            System.err.println("Base inválida");
        } else {
            this.base = base;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            System.err.println("Altura inválida");
        } else {
            this.altura = altura;
        }
    }

    public double calculaArea() {
        return this.base * this.altura;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a base do retângulo: ");
        double base = teclado.nextDouble();

        System.out.print("Informe a altura do retângulo: ");
        double altura = teclado.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);

        System.out.println("Área do retângulo: " + retangulo.calculaArea());

        teclado.close();
    }
}
