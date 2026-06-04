package Aulas.Aula14Avaliaçao02;

//import java.util.ArrayList;

public class ReservaPrincipal {


    public static void main(String[] args) {
        Reserva reserva = new Reserva("ANANA", 5, 10, true);
        // ArrayList lista = new ArrayList<>();
        ReservaOnline reserva2 = new ReservaOnline("teste", true);
        ReservaPresencial reserva3 = new ReservaPresencial("t", 45, 580, true, 5);


        reserva.realizarReserva(reserva);
        //reserva.listarReservas(reserva);
        reserva2.realizarReserva(reserva2);
        reserva3.cancelarReserva(reserva3);
        reserva.cancelarReserva(reserva);
        reserva.exibir();

        

        
    }
    
}
