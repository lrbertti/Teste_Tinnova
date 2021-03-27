/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author lrber
 */
public class BubbleSort {
   
    /*
        Declaração de variaveis
    */
    
    private int vetor[];

    /*
        Construtores
    */
     
    public BubbleSort(int vetor[]) {
        this.vetor = vetor;
    }

    /*
        Gets e Sets
    */
    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int vetor[]) {
        this.vetor = vetor;
    }
    
    /*
        Implementação de metodos
    */
    public void ordenar(){
      // for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
      for(int i = 0; i < vetor.length - 1; i++) {
        // for utilizado para ordenar o vetor.
        for(int j = 0; j < vetor.length - 1 - i; j++) {
          /* Se o valor da posição atual do vetor for maior que o proximo valor,
            então troca os valores de lugar no vetor. */
          if(vetor[j] > vetor[j + 1]) {
            int aux = vetor[j];
            vetor[j] = vetor[j + 1];
            vetor[j + 1] = aux;
          }
        }
      }
    }
    
    public void printVetor(){
        for (int i=0; i<vetor.length; i++) {
          System.out.print(vetor[i] + ", ");
        }
    }
}
