import java.util.Scanner;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo() {
    }

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.setLadoA(ladoA);
        this.setLadoB(ladoB);
        this.setLadoC(ladoC);
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        if (ladoA <= 0) {
            System.err.println("Lado A inválido");
        } else {
            this.ladoA = ladoA;
        }
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        if (ladoB <= 0) {
            System.err.println("Lado B inválido");
        } else {
            this.ladoB = ladoB;
        }
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        if (ladoC <= 0) {
            System.err.println("Lado C inválido");
        } else {
            this.ladoC = ladoC;
        }
    }

    public boolean verificaEquilatero() {
        return this.ladoA == this.ladoB && this.ladoB == this.ladoC;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o lado A do triângulo: ");
        double ladoA = teclado.nextDouble();

        System.out.print("Informe o lado B do triângulo: ");
        double ladoB = teclado.nextDouble();

        System.out.print("Informe o lado C do triângulo: ");
        double ladoC = teclado.nextDouble();

        Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);

        if (triangulo.verificaEquilatero()) {
            System.out.println("O triângulo é equilátero");
        } else {
            System.out.println("O triângulo não é equilátero");
        }

        teclado.close();
    }
}
