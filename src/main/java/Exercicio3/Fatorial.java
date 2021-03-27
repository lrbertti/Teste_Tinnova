/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

/**
 *
 * @author lrber
 */
public class Fatorial {

    public Fatorial() {
    }
       
    public int calculoFatorial(int valor){
        
        if(valor == 1 || valor == 0 )
            return 1;
        else
            return (calculoFatorial(valor-1) *valor);
    }    
}
