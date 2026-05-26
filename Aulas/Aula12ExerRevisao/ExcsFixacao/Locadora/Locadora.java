package Aulas.Aula12ExerRevisao.ExcsFixacao.Locadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Veiculo> frota = new ArrayList<>(); // fica como atributo de locadora

    public void adicionarVeiculo(Veiculo v) {
        frota.add(v);
    }

    public void listarFrota() {
        for (Veiculo veiculo : frota) {
            veiculo.exibirInfo(); // ex de polimorfismo, o java chamará o certo para cada tipo
            System.out.println("-------------");
        }
    }
    
    public Veiculo veiculoMaisRapido() {
        Veiculo maisRapido = frota.get(0); // primeiro da lista é o que pegamos
        for (Veiculo veiculo : frota) {
            if (veiculo.getTopSpeed() > maisRapido.getTopSpeed()) {
                maisRapido = veiculo;
            }
        }
        return maisRapido;
    }
   
    
}
