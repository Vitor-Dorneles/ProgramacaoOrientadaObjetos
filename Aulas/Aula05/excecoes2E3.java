package Aulas.Aula05;
public class excecoes2E3 {
    public static void main(String[] args) {
        // Exemplo 2: Divisão por zero
        int a = 10;
        int b = 0;
        System.out.println(a/b); // Isso causará uma ArithmeticException
        // Tratar essa exceção usando um bloco try-catch
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida. " + e.toString());
        }

        // Exemplo 3: Tentando converter uma string para um número
        String str = "abc";
        int valor = Integer.parseInt(str); // Isso causará uma NumberFormatException
        // Tratar essa exceção usando um bloco try-catch
        try {
            System.out.println(valor);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Não é possível converter a string para um número. " + e.toString());
        }
    }
    
}
