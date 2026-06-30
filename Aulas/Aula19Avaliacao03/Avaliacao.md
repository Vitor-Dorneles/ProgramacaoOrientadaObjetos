# Atividade Prática: Sistema de Biblioteca em Java

Desenvolva uma aplicação em Java que atenda aos seguintes requisitos.

---

## Parte 1 – Classe `Livro`

Crie uma classe `Livro` contendo os seguintes atributos privados:

- `titulo`
- `autor`
- `anoPublicacao`
- `emprestado` (`boolean`)

### Implemente:

- Construtor
- Getters e Setters
- Método `toString()`

---

## Parte 2 – Classe `Biblioteca`

Crie uma classe `Biblioteca` responsável por gerenciar os livros.

Ela deve possuir um:

```java
ArrayList<Livro>
```

### Métodos obrigatórios:

```java
adicionarLivro(Livro livro)
listarLivros()
salvarArquivo(String nomeArquivo)
carregarArquivo(String nomeArquivo)
```

---

## Classe Principal

Implemente um sistema que execute continuamente o seguinte menu:

```text
===== MENU =====

1 - Cadastrar livro
2 - Listar livros
0 - Sair

Opção:
```

### Regras

- O menu deve permanecer em execução até que o usuário escolha a opção **0**.
- Ao selecionar **Cadastrar livro**, o sistema deve solicitar os dados do livro e adicioná-lo à biblioteca.
- Ao selecionar **Listar livros**, o sistema deve exibir todos os livros cadastrados.
- Os dados devem ser persistidos em arquivo utilizando os métodos:
  - `salvarArquivo(String nomeArquivo)`
  - `carregarArquivo(String nomeArquivo)`

---

## Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Classes e Objetos
- Coleções (`ArrayList`)
- Manipulação de Arquivos
- Estruturas de Repetição (`while`)
- Menus Interativos no Console