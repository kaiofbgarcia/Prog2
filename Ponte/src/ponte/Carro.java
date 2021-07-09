/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponte;

import java.util.logging.Level;
import java.util.logging.Logger;
import static ponte.Ponte.getPonte;
import static ponte.Ponte.setPonte;

/**
 *
 * @author kaiof
 */
public class Carro extends Thread{
    
    @Override
    public synchronized void run (){  
        while (getPonte() == true){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        setPonte(true);
        System.out.println(Thread.currentThread().getName() +" está passando");
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        setPonte(false);
        notifyAll();
    }
}
