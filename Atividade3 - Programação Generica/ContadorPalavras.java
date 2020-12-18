package atividade3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ContadorPalavras {
    public static Map<String, Integer> contador(String[] string) throws IOException {
        // Criação da variavel map, que receberá as palavras e suas frequencias{
        Map<String, Integer> mapPoema = new HashMap<String, Integer> ();
        //}
        //Aqui ocorrerá um laço de repetição onde 's' recebe as palavras que vieram com 'string', já separadas no "Main",
        // e será feita analise palavra por palavra se ela já existe na variavel 'map', se sim +1 no valor se não ela é 
        // incrementada com o valor inicial de 1{
        for (String s : string) {
            if (!mapPoema.containsKey(s)) {
                mapPoema.put(s, 1);
            } else {
                int i = mapPoema.get(s);
                mapPoema.put(s, i + 1);
            }
        }
        //}
        return mapPoema;
    }    
}     