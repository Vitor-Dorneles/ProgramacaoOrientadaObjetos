package Aulas.Aula14Avaliaçao02;

import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class Reserva {

    protected String nomeCliente;
    protected int numeroQuarto;
    protected double valorDiaria;
    protected boolean statusReserva;
    protected ArrayList <Reserva> reservaLista = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);



public Reserva(String nomeCliente){
    this.nomeCliente = nomeCliente;
}

public Reserva (String nomeCliente, int numeroQuarto, double valorDiaria, boolean statusReserva) {
    this.nomeCliente = nomeCliente;
    this.numeroQuarto = numeroQuarto;
    this.valorDiaria = valorDiaria;
    this.statusReserva = statusReserva;
}




public Reserva realizarReserva(Reserva reserva) {
    System.out.println("\nVamos realizar a sua reserva");
    System.out.println("Informe o nome");
    String nome = teclado.nextLine();
    System.out.println("Informe o numero do quarto");
    int num = teclado.nextInt();
    System.out.println("Valor de diária");
    double valor = teclado.nextDouble();
    boolean status = true;

    Reserva teste = new Reserva(nome, num, valor, status);
    reservaLista.add(teste);
    
    return teste;    
}


public void exibir() {
    System.out.println(reservaLista);
}

public void cancelarReserva(Reserva reserva) {
    System.out.println("\nReserva comum");
    reserva.setStatusReserva(false);
    if (reservaLista.contains(reserva)) {
        reservaLista.remove(reserva);        
    }
}

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public int getNumeroQuarto() {
        return numeroQuarto;
    }
    public void setNumeroQuarto(int numeroQuarto) {
        if (numeroQuarto>0) {
            this.numeroQuarto = numeroQuarto;
        }
    }
    public double getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(double valorDiaria) {
        if (valorDiaria>=0) {
            this.valorDiaria = valorDiaria;
        }
    }
    public boolean StatusReserva() {
        return statusReserva;
    }
    public void setStatusReserva(boolean statusReserva) {
        this.statusReserva = statusReserva;
    }
    
}
