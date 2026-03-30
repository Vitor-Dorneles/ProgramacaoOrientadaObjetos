package Aulas.Aula05;

public class TratamentoExcecoes {
    public static void main(String[] args) {
        try {
            int [] numeros = {1,2,3}; // 0, 1 e 2
            System.out.println(numeros[3]); // não existe
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nExceção de índice fora dos limites: " + e.toString()); //lançado
            
        } catch (Exception e) { // caso aconteça outro erro, ele vai para o "E"
            System.out.println("Exceção ocorrida: " + e.toString()); // aqui exibimos a mensagem do erro
        }
    }
}