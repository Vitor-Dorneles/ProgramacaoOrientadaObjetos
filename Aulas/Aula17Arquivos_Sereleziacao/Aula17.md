// Data: 16/06/2026
# Arquivos, Serealização e Socket
Biblioteca java.io
temos os seguintes métodos para manipulação
### FileWriter
    usada para escrever caracteres em um arquivo, dados de caracteres, permite gravar dados de caracteres em um arquivo e subtitui dados existentes
### BufferedWriter
    Usado em grande quantidade de dados, usado em um grande fluxo buscando um fluxo de saida de melhor desempenho, escrevemos os dados em um buffer interno antes de gravar de verdade no arquivo. Isso torna a gravação mais eficiente

### FileReader
    usada para ler caracteres de um arquivo

### BufferedReader
    usada para ler uma grande quantidade de arquivos onde segue com a mesma premissa de buffer, le primeiro em um buffer interno antes de retornar ao chamador, tornando a leitura mais eficiente pois minimiza o numero de operações

### Exemplos aula
nos exemplos temos uma classe com construtor e métodos de encapsulamento, na main instanciamos os objetos e abrimos/criamos o arquivo com o FileWriter, depois escrevemos neste arquivo com o BufferedWriter, desta forma ```java BufferedWriter escritor = new BufferedWriter(arquivo) 
escritor.write(aluno.nome) como exemplo, 
escritor.newline 
depois fechamos o BufferedWriter
escritor.close()
e também fechamos o arquivo, momento de salvamento
arquivo.close()```

**Leitura do arquivo**
Processo bem parecido, usamos FileReader para abrir o arquivo e BufferedReader para ler efetivamente
```java 
//fluxo correto
FileReader arquivo = new FileReader(caminho);
BufferedReader leitor = new BufferedReader(arquivo);

//linha que vai receber os dados lidos
String linha;
//percorremos este arquivo linha a linha
//enquanto a linha não é nula
while ((linha = leitor.readLine()) != null) {
String[] campos = linha.split(","); // splitamos essa linha e guardamos cada campo em um vetor de String

String nome = campos[0] //a posição 0 do vetor vai corresponder ao primeiro dado splitado que aqui é o nome
int idade = Integer.parseInt(campos[1]) // aqui a idade corresponde a posição 1 do vetor, convertemos de String para int
//criamos o objeto
}
//finalização da leitura
leitor.close() //fechamos o BufferedReader
arquivo.close() // fechamos o arquivo
```



# Serealização

