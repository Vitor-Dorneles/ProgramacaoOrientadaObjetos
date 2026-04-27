// 1-Crie uma classe chamada Carro que possua 3 atributos:marca,modelo e anoFabricacao.Além disso,crie uma classe executável para criar 2 objetos do tipo Carro e exibir na tela os valores dos atributos criados.

// •Esses valores devem ser solicitados ao usuário,por linha de execução.
package Aulas.Aula03.ExsRevisao;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }


    public void exibirCarro() {
        System.out.println("\n");
        System.out.println(this.modelo);
        System.out.println(this.marca);
        System.out.println(this.anoFabricacao);
        System.out.println("\n");
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    
    
    
}
