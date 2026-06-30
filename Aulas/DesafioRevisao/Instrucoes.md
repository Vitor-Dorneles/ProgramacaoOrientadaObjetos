# Atividade Prática: Sistema de Cadastro de Veículos em Java

Desenvolva um sistema de cadastro de veículos utilizando a linguagem Java, aplicando os conceitos de Manipulação de Arquivos e Orientação a Objetos (OO).

# Menu Principal (Laço Infinito)

O programa deve exibir um menu interativo dentro de um laço de repetição infinito (while (true)), com as seguintes opções:

1. Cadastrar veículo
2. Alterar quilometragem do veículo
3. Excluir veículo pelo número da placa
4. Sair do sistema

# Requisitos de Implementação

## 1. Manipulação de Dados e Arquivos

- Lógica de Objetos: Toda a manipulação de dados deve ser feita por meio de objetos da classe Veiculo armazenados em uma lista de veículos (List<Veiculo>).
- Fluxo de salvamento: Antes de gravar no arquivo, o veículo deve ser instanciado como um objeto e adicionado à lista. Em seguida, a lista atualizada deve ser salva no arquivo.
- Formato: Os dados devem ser persistidos em um arquivo de texto.
- Diferencial: Utilizar a técnica de Serialização de objetos para salvar e ler a lista no arquivo.

## 2. Estrutura da Classe Veiculo

A classe deve possuir estritamente os seguintes atributos privados e métodos de acesso:

### Atributos Privados

- placa (String)
- modelo (String)
- marca (String)
- anoFabricacao (int)
- quilometragem (double)

### Métodos de Acesso (Encapsulamento)

- Todos os atributos devem possuir métodos get (leitura).
- Apenas o atributo quilometragem pode possuir um método set (alteração).

# Regras de Apresentação e Entrega

- Proibido o uso de ferramentas de IA: Não é permitido o uso de ChatGPT, GitHub Copilot ou assistentes semelhantes.
- Critério de avaliação: O código deve ser desenvolvido exclusivamente com base no material teórico e prático trabalhado em aula.

# Parte 2 - Socket

Utilizando a base desenvolvida de cadastro de veículos, agora implemente uma aplicação cliente x servidor.

## Cliente

- No cliente é onde ficará a lista e o arquivo de veículos cadastrados.
- A aplicação cliente não terá acesso direto à lista.
- A aplicação cliente deverá ler os dados de um veículo para ser cadastrado.
- A aplicação cliente deverá instanciar um objeto Veiculo.
- O cliente deverá enviar o objeto para o servidor para ser cadastrado.

## Servidor

- O servidor deverá receber o objeto enviado pelo cliente.
- O servidor deverá realizar o cadastro do veículo.
- O servidor deverá retornar ao cliente uma mensagem informando se o cadastro foi efetuado com sucesso ou não.