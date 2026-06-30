package Aulas.Aula14Avaliaçao02;

public class ReservaOnline extends Reserva {
    private int porcentagemDesconto;

    public ReservaOnline(String nomeCliente, boolean statusReserva){
        super(nomeCliente);
        this.statusReserva = statusReserva;
    }

    public ReservaOnline(String nomeCliente, boolean statusReserva, int porcentagemDesconto) {
        super(nomeCliente);
        this.statusReserva = statusReserva;
        this.porcentagemDesconto = porcentagemDesconto;
    }

    public Reserva realizarReserva() {
        System.out.println("\nReserva online");
        System.out.println("Vamos realizar a sua reserva");
        System.out.println("Informe o nome");
        String nome = teclado.nextLine();
        boolean status = true;
        System.out.println("Demais informações devem ser informadas na recepção");
        while (true) {
            System.out.println("Possui cupom de desconto? ");
            System.out.println("Digite 1 para Sim e 2 para não");
            int cupom = teclado.nextInt();
                if (cupom == 1) {
                    System.out.println("Informe a porcentagem de desconto");
                    int desconto = teclado.nextInt();

                    ReservaOnline testi = new ReservaOnline(nome, status, desconto);

                    reservaLista.add(testi);
                    return testi;
                }
            break;            
        }
    
        ReservaOnline teste = new ReservaOnline(nome, status);
        reservaLista.add(teste);
        
        return teste;    
    }


    public void cancelarReserva(ReservaOnline reserva) {
        System.out.println("\nSe atente ao prazo de que só podemos cancelar 24hs antes");

        reserva.setStatusReserva(false);
        if (reservaLista.contains(reserva)) {
            reservaLista.remove(reserva);        
        }
    }

    
    
}
