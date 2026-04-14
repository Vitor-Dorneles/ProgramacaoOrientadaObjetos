import java.util.Scanner;

public class Circulo {
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio <= 0) {
            System.err.println("Raio inválido");
        } else {
            this.raio = raio;
        }
    }

    public double calculaArea() {
        return Math.PI * this.raio * this.raio;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o raio do círculo: ");
        double raio = teclado.nextDouble();

        Circulo circulo = new Circulo(raio);

        System.out.println("Área do círculo: " + circulo.calculaArea());

        teclado.close();
    }
}
