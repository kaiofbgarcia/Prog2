package capitulo_6.exercicios;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        // Exemplo de LocalDate
        
        // Criando um objeto com a data atual do sistema
        LocalDate ld = LocalDate.now();
        System.out.println(ld); // mostra no padrão yyyy-MM-dd
        //Para formatar uma data
        System.out.println(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        // Para criar uma data específica 
        LocalDate umaData = LocalDate.of(2020, Month.SEPTEMBER, 1); 
        // ou 
        LocalDate outraData = LocalDate.of(2020, 9, 20); 
       
        
        
        // Exemplo de arrays de objetos
        ArrayList<Pessoa> pessoas = new ArrayList(); 
        pessoas.add(new Pessoa("Bob Esponja", LocalDate.of(1980, Month.APRIL, 1))); 
        pessoas.add(new Pessoa("Patrick", LocalDate.of(1990, Month.APRIL, 10)));
        pessoas.add(new Pessoa("Lula Molusco", LocalDate.of(1960, Month.DECEMBER, 15)));
        pessoas.add(1, new Pessoa("Plankton", LocalDate.of(1961, Month.DECEMBER, 31)));
        
        
        int i=0;
        for(Pessoa aux : pessoas){
            System.out.println(pessoas[i].getNome());
            i++;
        }
        
        
        
        
    }
    
    
    
}
