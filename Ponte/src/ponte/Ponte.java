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
public class Ponte extends Thread {
    Boolean ponte = false;

    public synchronized void atravessar(String nome){
        try {
        while (ponte == true){
            wait();
        }
        System.out.println(nome+" está passando");
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        Thread.sleep(1000);
        this.ponte = true;
        passou();  
        } catch (InterruptedException ex) {}
    }
    public synchronized void passou(){
        notifyAll();
        this.ponte = false;
    }
}
