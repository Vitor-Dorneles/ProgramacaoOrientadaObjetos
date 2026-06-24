import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaCadastro {
    private List<Veiculo> listaDeVeiculos = new ArrayList<>();
    private Scanner teclado = new Scanner(System.in);


    public void exibirMenu() {
        int opcao = -1;
        while (true) {
            System.out.println("\tMENU PRINCIPAL\n");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Alterar quilometragem do veículo");
            System.out.println("3. Excluir veículo pelo número da placa");
            System.out.println("4. Sair do sistema");
            System.out.print("Escolha uma opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarVeiculo();
                    break;
                case 2:
                    alterarQuilometragem();
                    break;
                case 3:
                    excluirVeiculo();
                    break;
                case 4:
                    System.out.println("\nSaindo do sistema");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção inválida.");
            }
        }
    }

    private void cadastrarVeiculo() {
        System.out.println("\nCadastrar Veículo");

        System.out.print("Informe a placa: ");
        String placa = teclado.nextLine();
        for (Veiculo v : listaDeVeiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("Já existe um veículo com esta placa");
                return;
            }
        }

        System.out.print("Informe o modelo do veículo: ");
        String modelo = teclado.nextLine();

        System.out.print("Informe a marca do veículo: ");
        String marca = teclado.nextLine();

        System.out.print("Informe o ano de fabricação: ");
        int anoFabricacao = teclado.nextInt();

        System.out.print("Informe a quilometragem: ");
        double quilometragem = teclado.nextDouble();
        teclado.nextLine();

        Veiculo novoVeiculo = new Veiculo(modelo, marca, placa, anoFabricacao, quilometragem);
        listaDeVeiculos.add(novoVeiculo);

        try {
            FileWriter arquivo = new FileWriter("Aulas/DesafioRevisao/veiculos.txt", true);
            
            BufferedWriter escritor = new BufferedWriter(arquivo);

            escritor.write(novoVeiculo.getMarca() + "," + novoVeiculo.getModelo() + "," + novoVeiculo.getPlaca() + ","
                    + novoVeiculo.getQuilometragem() + "," + novoVeiculo.getAnoFabricacao());
            escritor.newLine();
            
            escritor.close();
            arquivo.close();
                    System.out.println("Veiculo Salvo no arquivo");
                } catch (IOException e) {
                    System.out.println("Erro ao salvar");
            e.printStackTrace();
        }
    }

    private void excluirVeiculo() {
        System.out.println("\nExcluindo veículo");
        System.out.print("Informe a placa: ");
        String placa = teclado.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < listaDeVeiculos.size(); i++) {

            if (listaDeVeiculos.get(i).getPlaca().equalsIgnoreCase(placa)) {
                listaDeVeiculos.remove(i);
                System.out.println("Veiculo Removido");
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            atualizarArquivo();            
        } else {
            System.out.println("Veiculo não encontrado");
        }
    }
    
    private void atualizarArquivo() {
        try {
            FileWriter arquivo = new FileWriter("Aulas/DesafioRevisao/veiculos.txt");
            BufferedWriter escritor = new BufferedWriter(arquivo);

            for (Veiculo v : listaDeVeiculos) {
                escritor.write(v.getMarca() + "," + v.getModelo() + "," + v.getPlaca() + ","
                        + v.getQuilometragem() + "," + v.getAnoFabricacao());
                escritor.newLine();
            }
            escritor.close();
            arquivo.close();
            System.out.println("Arquivo atualizado");
        } catch (IOException e) {
            System.out.println("Erro");
            e.printStackTrace();
        }
    }

    private void alterarQuilometragem() {
        System.out.println("Alterando quilometragem");
        System.out.println("Informe a placa do veiculo");
        String placa = teclado.nextLine();

        boolean encontrou = false;

        for (Veiculo v : listaDeVeiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("Quilometragem atual: " + v.getQuilometragem());
                System.out.println("Digite a nova quilometragem: ");
                double novaKm = teclado.nextDouble();
                teclado.nextLine();

                v.setQuilometragem(novaKm);
                System.out.println("Quilometraem alterada");

                encontrou = true;
                break;
            }
        }
        if (encontrou) {
            atualizarArquivo();
        } else {
            System.out.println("Veiculo não encontrado");
        }

    }

}