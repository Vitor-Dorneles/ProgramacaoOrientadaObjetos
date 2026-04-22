// Data: 14/04/2026

1) Explique os seguintes conceitos de POO em Java:

a) Classe: É como um conjunto de objetos, na programação orientada a objetos representam algo do mundo real.

b) Objeto: Serve para relacionar dados juntos, por exemplos diferentes dados de uma pessoa sendo guardados em um espaço de memória unico.

c) Atributo: Característica0, valores.

d) Método: Métodos são o conjunto de instruções que damos para resolver algo, geralmente nos retornam valores.

e) Encapsulamento:
É o ocultamento e proteção de informações, dados internos de uma calsse, só sendo permitido o acesso de forma controlada por meio dos métodos getters e setters.



2) Qual a diferença entre método e construtor em uma classe? Dê um exemplo.
Método: é usado para executar uma ação/comportamento do objeto e pode ser chamado várias vezes.
Construtor: é usado para criar e inicializar o objeto; é chamado automaticamente quando usamos new.
```java
class Pessoa {
    String nome;

    // Construtor
    Pessoa(String nome) {
        this.nome = nome;
    }

    // Método
    void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Ana"); // chama o construtor
        p.apresentar();               // chama o método
    }
}
```  

3) O que são modificadores de acesso em Java? Cite e explique brevemente os principais.
Modificadores de acesso em Java definem quem pode acessar classes, atributos e métodos. Os principais são public, private e protected.
   

4) Qual a diferença entre os tipos de dados String, int e boolean? Dê um exemplo de uso de cada um.
Os dados como String são como armazenadores de texto, não são usados para fazer contas e etc.
String nome;
Int são dados numéricos de inteiros
int valor = 4;
Boolean é um tipo restrito que serve para monitorarmos condição. Ele apenas nos retorna True ou False, 0 ou 1

5) Explique o que é e para que serve o método toString() em uma classe. 
 Serve para reescrevemos e definirmos como o nosso objeto será apresentado em texto. Podendo assim facilitar a exibição do objeto.

6) Descreva o que acontece quando se tenta acessar um atributo privado diretamente fora da classe. Como é possível acessá-lo de forma correta? Se não utilizarmos o método correto não conseguiremos acessar, temos que usar o método get se quisermos mostrar esse atributo, e o método set se quisermos alterar este atributo.
   


7) Crie uma classe Produto com os atributos:

nome (String)

preco (double)

quantidade (int)

Implemente:

Um método exibirInformacoes() que exibe os dados do produto

Um método calcularValorTotal() que retorna o valor total em estoque (preço x quantidade)

Na Main:

Crie dois produtos, sendo um com valores informados via teclado e outro com valores definidos no código

Exiba as informações e o valor total de cada produto



8) Crie uma classe Usuario com os atributos:

nomeUsuario (String)

senha (String)

logado (boolean, inicialmente false)

Implemente:

Um método login(String usuario, String senha) que valida os dados e muda o valor de logado para true se estiver correto

Um método logout() que define logado como false

Um método exibirStatus() que mostra se o usuário está logado ou não

Na Main:

Crie um usuário com nome e senha definidos no código

Peça que o usuário digite os dados via teclado para fazer login

Mostre se o login foi bem-sucedido e permita o logout



9) Crie uma classe Filme com os atributos:

titulo (String)

diretor (String)

duracaoEmMinutos (int)

genero (String)

Crie os métodos:

exibirDetalhes() para mostrar todas as informações do filme

ehLongo() que retorna true se o filme tiver mais de 120 minutos

Na Main:

Peça ao usuário os dados de um filme e mostre os detalhes e se ele é considerado um filme longo




10) Crie uma classe Tarefa com os atributos:

descricao (String)

concluida (boolean, inicializado como false)

Implemente:

Um método concluirTarefa() que marca a tarefa como concluída

Um método exibirTarefa() que exibe a descrição e se ela está concluída ou não

Na Main:

Crie um vetor ou lista com 3 tarefas (usando entrada via teclado)

Marque uma das tarefas como concluída

Mostre todas as tarefas com seu status