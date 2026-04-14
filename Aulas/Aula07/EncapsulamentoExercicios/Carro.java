import java.util.Scanner;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank() || marca.isEmpty()) {
            System.err.println("Marca inválida");
        } else {
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank() || modelo.isEmpty()) {
            System.err.println("Modelo inválido");
        } else {
            this.modelo = modelo;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano <= 0) {
            System.err.println("Ano inválido");
        } else {
            this.ano = ano;
        }
    }

    public void exibeDetalhes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a marca do carro: ");
        String marca = teclado.nextLine();

        System.out.print("Informe o modelo do carro: ");
        String modelo = teclado.nextLine();

        System.out.print("Informe o ano do carro: ");
        int ano = teclado.nextInt();

        Carro carro = new Carro(marca, modelo, ano);
        carro.exibeDetalhes();

        teclado.close();
    }
}
