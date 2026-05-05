// Data: 05/05/2026
Herança --> Polimorfismo
POO nos permite programar em geral e depois ir especificando

- Sobrescrita de Métodos
  trabalhando diretamente com Herança
  mesmo nome, mesmos parametros e mesmo tipo de retorno
  classe pai = classe base
  Sobrescrita é o processo de fornecer uma implementação diferente para um método já definido em um classe base

  Sobrescrita acontece já automaticamente com o mesmo nome de método
  podemos usar @Override para identificar uma Sobrescrita

- Sobrecarga de Métodos
    não ligada a Herança, mesmo nome, mas parametros diferentes e/ou tipos de retorno diferentes
    permite que a classe tenha vários métodos com o mesmo nome, porém com funções diferentes, dependendo dos parâmetros que são passados.
    o java decide qual método chamar, com base nos parametros passados, ele opta pelo primeiro que se enquadrar.
    