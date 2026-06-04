// Data: 02/06/2026
# Herança - Classe Abstract
uma classe que não pode ser instanciada, não podemos criar objetos a partir dela
ela é projetada para ser estendida por outras classes que podem ser instanciadas
podemos definir métodos abstratos na classe abstrata, método sem implementação que deve ser implementado na classe que estende
**abstract** antes da palavra class.

As classes abstratas são úteis quando desejamos definir um comportamento padrão que deve ser implementado por outras classes
garantindo que tenham uma "interface" comum e que implementem determinados metodos

Se eu tenho métodos a mais na classe que extende, não posso definir um tipo padrão para ambos objetos de classes diferentes
podemos ter métodos que sejam abstratos e métodos completos, podemos ter construtores
Atributos com diferentes niveis de visibilidade, 
utilizada quando desejamos reutilizar implementações

# Interface
espécie de contrato que define um conjunto de métodos que uma classe deve implementar

permite que diferentes classes possam implementar seus proprios comportamentos para um conjunto de metodos pre-definidos em comum.
permitindo assim tratarmos as classes de forma polimorfica, uma referencia a uma interface pode referenciar objetos de diferentes classes que usam essa interface

métodos definidos na interface são public e abstract
para usar uma interface em uma classe usamos a palavra **implements**
forma de desenvolvimento moderno, voltado a equipes, facilita a manter um padrão de desenvolvimento, organizando a equipe.

na Interface existe Herança multipla

## **Uso**
Interface é utilizada quando é desejado definir um conjunto de métodos, que devem ser implementados por classes distintas, que podem ter diferentes comportamentos mas tem alguma caracteristica em comum
* permite o **polimorfismo** de objetos de diferentes classes que implementam a mesma interface
* favorece a modularização, pois as classes qie implementam a mesma interface são agrupadas de forma lógica
* independencia de implementação, pois uma classe pode implementar várias interfaces diferentes

# Diferença Classe Abstrata vs Interface
* classe abstrata pode conter métodos abstratos e não abstratos -- a interface só metodos abstratos
* classe abstrata pode ter construtores -- uma interface não
* uma classe pode implementar várias interfaces -- mas só pode herdar de uma abstrata
* em uma interface os atributos devem ser public e static
* a interface é mais restritiva pois exige que todas as classes que a usarem, usem todos os seus metodos





# Proxima Aula
Exceções serão melhor tratadas, exercicios