# Prática

**Disciplina:** Programação Orientada a Objetos  
**Professor:** Ricardo Frohlich da Silva  
**Universidade Franciscana**

## Orientações

- Ligue o computador, abra a IDE que deseja utilizar.
- Desligue o cabo de rede, não é permitido consulta em nenhum lugar (utilize a IDE).
- Ao finalizar, chame o professor e faça a submissão no MinhaUFN.

---

Crie uma classe chamada `Reserva` com métodos para `realizarReserva()` e `cancelarReserva()`.

Em seguida, crie duas subclasses:

- `ReservaOnline`
- `ReservaPresencial`

que estendem a classe `Reserva`.

### Sobrecarga

Sobrecarregue o método `realizarReserva()` em `ReservaOnline` para permitir:

- reserva apenas com nome do cliente;
- reserva com nome do cliente e cupom de desconto.

### Sobrescrita

Sobrescreva o método `cancelarReserva()` nas subclasses:

- Em `ReservaOnline`, o cancelamento só pode ocorrer até 24 horas antes da hospedagem;
- Em `ReservaPresencial`, o cancelamento pode ser realizado diretamente na recepção.

### Encapsulamento

Utilize encapsulamento adequado para proteger os atributos da reserva, como:

- `nomeCliente`
- `numeroQuarto`
- `valorDiaria`
- `statusReserva`

### Getters e Setters

Crie getters e setters com validações apropriadas.

### Polimorfismo

Demonstre o uso de polimorfismo criando um vetor ou `ArrayList` de reservas contendo objetos de diferentes tipos (`ReservaOnline` e `ReservaPresencial`) e execute os métodos para mostrar comportamentos diferentes conforme o tipo da reserva.