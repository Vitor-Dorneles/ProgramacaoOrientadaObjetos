package Aulas.Aula14Avaliaçao02;

public class ReservaPresencial extends Reserva {
    private int dias;

    public ReservaPresencial (String nomeCliente, int numeroQuarto, double valorDiaria, boolean statusReserva, int dias) {
        super(nomeCliente, numeroQuarto, valorDiaria, statusReserva);
        this.dias = dias;
    }

    
    

    public void cancelarReserva(ReservaPresencial reserva) {
        System.out.println("\nO cancelamento pode ser realizado diretamente na recepção");

        reserva.setStatusReserva(false);
        if (reservaLista.contains(reserva)) {
            reservaLista.remove(reserva);        
        }
    }
}
