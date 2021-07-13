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
public class Carro extends Thread{
    String nome;
    Ponte ponte;
    
    public Carro(String nome, Ponte ponte) {
        this.nome = nome;
        this.ponte = ponte;
    }
   
    @Override
    public synchronized void run (){  
        while(true){
            ponte.atravessar(nome);
        }
    }
}
