package CalculoParalelo;

import java.io.File;
import java.util.concurrent.ForkJoinPool;

public class CalculoTeste {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        long size = CalculoConvencional.calcular(new File("C:\\Users\\kaiof\\OneDrive\\Área de Trabalho\\EAD 2020"));
        long gastou = System.currentTimeMillis() - inicio;
        System.out.println(size / 1024 + " Gastou: " + gastou);
        
        inicio = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool();
        size = pool.invoke(new CalculoParalelo(new File("C:\\Users\\kaiof\\OneDrive\\Área de Trabalho\\EAD 2020")));
        gastou = System.currentTimeMillis() - inicio;
        System.out.println(size / 1024 + " Gastou: " + gastou);          
    }
}