package Aulas.Aula06;

// 4-Crie uma classe chamada Retangulo com os atributos largura e altura.Crie um construtor que inicialize esses atributos.Implemente os métodos calcularArea(),que retorna a área do retângulo,calcularPerimetro(),que retorna o perímetro,calcularDiagonal(),que calcula e retorna a diagonal utilizando a função Math.sqrt(),e ehQuadrado(),que retorna true caso a largura seja igual à altura.

public class Retangulo {
    double largura;
    double altura;
    
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public double calcularDiagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }

    public boolean ehQuadrado() {
        return largura == altura;
    }
}
