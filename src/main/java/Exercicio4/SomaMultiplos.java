/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

/**
 *
 * @author lrber
 */
public class SomaMultiplos {

    public SomaMultiplos() {
    }
    
    public int somaMultiplos3e5(int maximo){
        
        int retorno = 0;
        for(int i = 0; i < maximo; i++){
            if(i % 3 == 0 || i % 5 == 0){
                retorno += i;
            }
        }
        
        return retorno;
    }
}
