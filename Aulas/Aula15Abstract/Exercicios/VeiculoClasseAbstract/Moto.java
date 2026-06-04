package Aulas.Aula15Abstract.Exercicios.VeiculoClasseAbstract;

public class Moto extends Veiculo {
    
    @Override
    public void freiar() {
        System.out.println(this.modelo + "Está freiando");
    }

    @Override
    public void acelerar() {
        System.out.println(this.modelo + " Está acelerando\n dentro da classe moto");
    }
    

    public static void main(String[] args) {
        Moto moto = new Moto();
        
        moto.modelo = "Honda";
        moto.acelerar();
        //Veiculo moto2 = new Carro(); 
        //moto2.acelerar();//dessa forma usamos o método da classe carro
    }
}
