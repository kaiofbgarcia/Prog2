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
public class Main {
    public static void main(String[] args) {
        Ponte ponte = new Ponte();
        Carro comum = new Carro("Comum", ponte);
        Carro ambulancia = new Carro("Ambulancia", ponte);
        Carro policia = new Carro("Policia", ponte);
   
        comum.setPriority(5);
        ambulancia.setPriority(10);
        policia.setPriority(7);
        
        comum.start();
        ambulancia.start();
        policia.start();
    } 
}
