/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa;

/**
 *
 * @author kaiog
 */
public class Caixa {
    float altura;
    float largura;
    float comprimento;
    float volume;
    
    float calcularVolume(float altura , float largura, float comprimento){
        volume = altura * largura * comprimento;
        return volume;
    }
    Caixa(){
    //Construtor
    altura = 0;
    largura = 0;
    comprimento = 0;
}
    Caixa(float x, float y, float z){
    //Construtor
    altura = x;
    largura = y;
    comprimento = z;
}
    Caixa(float a){
    //Construtor
    altura = a;
    largura = a;
    comprimento = a;
}
        
    public static void main(String[] args) {
        // TODO code application logic here
        float x;
        float y;
        float z;
        float a;
        x = 3;
        y = 4;
        z = 5;
        a = 10;
        Caixa obj1 = new Caixa();
        Caixa obj2 = new Caixa(x,y,z);
        Caixa obj3 = new Caixa(a);
    }
    
}
