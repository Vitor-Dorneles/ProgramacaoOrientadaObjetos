package Aulas.Aula15Abstract.Exercicios.InterfaceAcessoDados;

//7- Analisando os exercícios anteriores, quais implementações podem ser desenvolvidas com interface? Não deveriam, pois contem atributos mutaveis, que cada classe filha determinaria os seus valores, com a interface isso não é possivel.


public interface AcessoDados {
    //poderiamos declarar atributos imutaveis
    //public final double SALARIO = 45; isso seria uma variavel imutavel em classes padrões, na interface mesmo que não seja declarada dessa forma, sera essa o padrão


        void conectar(); // na interface não precisamos usar "public" e "abstract" antes do método, pois é o padrão

        void desconectar();

        void inserir();

        void atualizar();

        void excluir();

    
}
