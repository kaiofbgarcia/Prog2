/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculoParalelo;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author kaiof
 */
public class CalculoParalelo extends RecursiveTask<Long>{
    File file;
    public CalculoParalelo(File file){
        this.file = file;
    }
    @Override
    protected Long compute() {
        long size = 0;
        if (file.isFile()) {
            return size = file.length();
        } else {
            File[] arqs = file.listFiles();
            if (arqs != null) {
                for (File arq : arqs) {
                    return CalculoParalelo.invokeAll(criarSubtarefas(arqs))
                        .stream()
                        .mapToLong(CalculoParalelo::join)
                        .sum();
                }
            }
        }
        return size;
    }
    private Collection<CalculoParalelo> criarSubtarefas(File[] arqs) {
        List<CalculoParalelo> subtarefas = new ArrayList<>();
        for (File arq : arqs) {
            subtarefas.add(new CalculoParalelo(arq));
        }
        return subtarefas;
    }
}



