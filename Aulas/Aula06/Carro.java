package Aulas.Aula06;

// 6-Crie uma classe chamada Carro com os atributos modelo,velocidadeAtual e velocidadeMaxima.Crie um construtor que inicialize esses atributos.Implemente os métodos acelerar(int valor),que aumenta a velocidade atual sem ultrapassar a velocidade máxima,frear(int valor),que diminui a velocidade atual sem permitir valores negativos,atingiuVelocidadeMaxima(),que retorna true se a velocidade atual for igual à velocidade máxima,e calcularTempoViagem(double distancia),que retorna o tempo aproximado de viagem considerando a fórmula tempo=distância dividido pela velocidade atual.

public class Carro {
    String modelo;
    int velocidadeAtual;
    int velocidadeMaxima;

    public Carro(String modelo, int velocidadeAtual, int velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar(int valor) {
        velocidadeAtual += valor;
        if (velocidadeAtual > velocidadeMaxima)
            velocidadeAtual = velocidadeMaxima;
    }

    public void frear(int valor) {
        velocidadeAtual -= valor;
        if (velocidadeAtual < 0)
            velocidadeAtual = 0;
    }

    public boolean atingiuVelocidadeMaxima() {
        return velocidadeAtual == velocidadeMaxima;
    }

    public double calcularTempoViagem(double distancia) {
        return distancia / velocidadeAtual;
    }

    
}
