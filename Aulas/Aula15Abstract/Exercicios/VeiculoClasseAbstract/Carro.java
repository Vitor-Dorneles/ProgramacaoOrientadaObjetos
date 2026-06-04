package Aulas.Aula15Abstract.Exercicios.VeiculoClasseAbstract;

public class Carro extends Veiculo {

    @Override
    public void acelerar() {
    System.out.println(this.modelo + " está acelerando");
}
    @Override
    public void freiar() {
    System.out.println("Freiando");
}

public static void main(String[] args) {
    Carro carro = new Carro();
    Veiculo carro2 = new Carro();
    carro.modelo = "Fiat 147";
    carro2.freiar();
    carro.acelerar();
}


    
}
