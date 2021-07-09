/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponte;

/**
 *
 * @author kaiof
 */
public class Ponte {
    public static Boolean ponte = false;

    public static Boolean getPonte() {
        return ponte;
    }
    public static void setPonte(Boolean ponte) {
        Ponte.ponte = ponte;
    }
    
    public static void main(String[] args) {
        Carro comum = new Carro();
        Carro ambulancia = new Carro();
        Carro policia = new Carro();
   
        comum.setPriority(1);
        ambulancia.setPriority(10);
        policia.setPriority(5);
        
        comum.setName("Comum");
        ambulancia.setName("Ambulancia");
        policia.setName("Policia");
        
        comum.start();
        ambulancia.start();
        policia.start();
    } 
}
