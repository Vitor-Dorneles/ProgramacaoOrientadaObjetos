package Aulas.Aula17Arquivos_Sereleziacao.Serializacao;
//serialização JSON

import Aulas.Aula11Polimorfismo.Sobrescrita.Mains.PessoaPrincipal;
//realizar import

public class PrincipalPessoa {
    public static void main(String[] args) {
        // criando objeto para serializar
        Pessoa p = new Pessoa("Ricardo", 20);

        //Convertendo o objeto em um JSONobject
        JSONObject json = new JSONObject();
        json.put("nome", p.getNome());
        json.put("idade", p.getIdade());
        String jsonString = json.toJSONString();

        gravaArquivo(jsonString);
        try {
            LerArquivo();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
    
}
