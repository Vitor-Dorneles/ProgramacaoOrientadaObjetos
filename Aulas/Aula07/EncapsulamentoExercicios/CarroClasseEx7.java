import java.util.Scanner;

public class CarroClasseEx7 {
    private String placa;
    private int numChassi;

    public CarroClasseEx7() {
    }

    public CarroClasseEx7(String placa, int numChassi) {
        this.setPlaca(placa);
        this.setNumChassi(numChassi);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank() || placa.isEmpty()) {
            System.err.println("Placa inválida");
        } else {
            this.placa = placa;
        }
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        if (numChassi <= 0) {
            System.err.println("Número de chassi inválido");
        } else {
            this.numChassi = numChassi;
        }
    }

    public void acelerar() {
        System.out.println("O carro de placa " + this.placa + " está acelerando!");
    }

    public boolean frear() {
        System.out.println("O carro de placa " + this.placa + " está freando!");
        return true;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a placa do carro: ");
        String placa = teclado.nextLine();

        System.out.print("Informe o número do chassi: ");
        int numChassi = teclado.nextInt();

        CarroClasseEx7 carro = new CarroClasseEx7(placa, numChassi);

        carro.acelerar();
        carro.frear();

        teclado.close();
    }
}