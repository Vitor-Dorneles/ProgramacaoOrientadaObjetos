import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaCadastro {
    // Atributos da classe do sistema
    private List<Veiculo> listaDeVeiculos = new ArrayList<>();
    private Scanner teclado = new Scanner(System.in);

    // O método do menu que você queria separar
    public void exibirMenu() {
        int opcao = -1;
        while (true) {
            System.out.println("1 - Cadastrar veículo");
            System.out.println("4 - Sair");
            opcao = teclado.nextInt();
            teclado.nextLine(); // limpa buffer

            if (opcao == 1) {
                cadastrarVeiculo(); // Chama o método modularizado aqui dentro!
            } else if (opcao == 4) {
                break;
            }
        }
    }

    // O método de cadastrar fica aqui, pois esta classe gerencia a lista!
    private void cadastrarVeiculo() {
        System.out.println("Digite o modelo:");
        String modelo = teclado.nextLine();
        // ... lê os outros dados ...

        // Cria o objeto veículo com os dados lidos
        Veiculo novo = new Veiculo(modelo, marca, placa, ano, km);

        // Adiciona na lista que pertence a ESTA classe
        listaDeVeiculos.add(novo);
        System.out.println("Veículo adicionado com sucesso!");
    }
}