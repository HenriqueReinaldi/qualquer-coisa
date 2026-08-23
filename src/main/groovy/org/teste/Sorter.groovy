package org.teste

import groovy.transform.TypeChecked

class Sorter {
    static void bbs(List<Integer> lista){
        lista.every {
            if(it !instanceof Integer){
                throw new IllegalArgumentException("Lista deve ser de inteiros")
            }
        }

        for (int i = 0; i < lista.size()-1; i++){
            for (int j = 0; j < lista.size()-1-i; j++){
                if (lista[j] > lista[j+1]){
                    def temp = lista[j];
                    lista[j] = lista[j+1]
                    lista[j+1] = temp
                }
            }
        }
    }
}
