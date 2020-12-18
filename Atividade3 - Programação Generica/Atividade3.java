package atividade3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Atividade3 {
    public static void main(String[] args) throws IOException {    
        //Criação das Variaveis{
        Map<String, Integer> map = new HashMap<String, Integer> (); 
        String poema = "É preciso estudar volapuque, \n" +
                       "é preciso estar sempre bebado, \n" +
                       "é preciso ler Baudelaire, \n" +
                       "é preciso colher as flores \n" +
                       "de que rezam velhos autores.";    
        //}
        //Mostrar o poema antes de trata-lo{
        System.out.println(poema);
        System.out.println("");
        //}
        //Tratar o Poema para que seja reconhecido corretamente{
        poema = poema.toLowerCase();
        poema = poema.replaceAll("([.,])", "");
        //}
        //Variavel 'map' chama o método 'contador' passando o poema tratado e separado como parametro{
        map = ContadorPalavras.contador(poema.split(" "));
        //}
        //Aqui é feita a impressão das palavras e dos valores de sua frequencia{
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
	}
        //}
    }
}
