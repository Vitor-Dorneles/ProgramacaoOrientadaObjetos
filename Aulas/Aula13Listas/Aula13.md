# Herança e Polimorfismo
- herança, polimorfismo e relacionamento entre classes: prova II 26/05
- Aula de exercícios

# Arrays, **Vetores** **tradicionais**
uma vez o array criado ele não pode ter seu tamanho alterado, podemos fazer arrays de tipos primitivos e objetos,
```java
//como declarar com tamanho fixo
int[] notas = new int[4]; //declaramos e inicializamos
double[] valores = new double[4];
float[] medidas = new float[4];

String[] nomes = new String[4];
// pode ser feito assim também
String[] nomes = {"Flavio", "jonildo"};
Pessoa[] alunos = new Pessoa[4];
```

como descobrir o tamanho de um array, usamos length
```java
int tamanho = nomes.length
```

**percorrendo**
```java
for (String nome : nomes) { //a string nome vai receber cada posição do array de string nomes
    sout(nome)
}
```

# Listas
São estruturas dinâmicas, o tamanho aumenta e diminui automaticamente
São estruturas de dados que permitem armazenar coleções de objetos, Implementadas com a interface List e criadas usando
- Classes: *ArrayList*, *LinkedList* e *Vector*

As listas podem ser percorridas usando for-each, podem conter objetos de qualquer tipo
- Métodos mais comuns: add, remove, get, set, size...

``` java 
//como declarar
//uma lista de objetos Pessoa
List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
//aqui a lista foi criada

//adicionando objetos
listaPessoas.add(pessoa1);
listaPessoas.add(pessoa2);

// podemos passar a lista como parametro para um método
exibirPessoas(listaPessoas);

// o método exibir funciona assim:
public static void exibirPessoas(List<Pessoa> lista) {
    for (Pessoa p : lista) { // percorremos cada objeto da lista passando para o objeto Pessoa "p"
    sout("Nome: " + p.getNome());
    sout("Idade: " + p.getIdade());
    }
}
```

A interface List define vários métodos que permitem manipular os elementos da lista,
- lista.add(obj elemento): adicionando um elemento a lista
- lista.add(int indice, obj elemento): adicionando um elemento em um indice especifico
- lista.remove(obj elemento) : removendo
- lista.remove(int indice) : removendo em um indice especifico
- lista.get(int indice): retorna o elemento da lista em um indice especifico
- lista.set(int indice, obj elemento): substitui o elemento da lista no índice especifico pelo objeto especificado
- lista.size(): retorna o tamanho da lista
- lista.isEmpty(): retorna true se a lista estiver vazia
- lista.contais(objeto): procura se o elemento especifico está na lista, retorna true ou false 
- lista.clear(): limpa a lista

## Exemplo de uso   
```java
// Instanciando a lista dinâmica que armazenará objetos da classe Produto
List<Produto> carrinho = new ArrayList<>();

// Simulando o uso no sistema (o tamanho vai crescendo conforme o clique do usuário)
carrinho.add(new Produto("Teclado Mecânico", 250.00));
carrinho.add(new Produto("Mouse Gamer", 150.00));

// Para saber quantos itens tem no carrinho agora:
int totalItens = carrinho.size();
```

# *LinkedList*
- Lista comuns é bom usar o ArrayList,
- *LinkedList* é uma lista encadeada, onde todos os "valores" são guardados em um ponteiro(endereço) indicando onde está o proxímo valor.
a inserção e remoção de dados é muito rápida, mas acessar esses dados é lento, 
a *LinkedList* é como uma fila(o primeiro que entrar é o primeiro a sair)
