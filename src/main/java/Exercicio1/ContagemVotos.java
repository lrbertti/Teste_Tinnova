/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author lrber
 */
public class ContagemVotos {
    
    /*
        Declaração de variaveis
    */
    
    private int total_votos;
    private int votos_validos;
    private int votos_brancos;
    private int votos_nulos;
    
    /*
        Construtores
    */
    public ContagemVotos() {
        this.total_votos = 0;
        this.votos_validos = 0;
        this.votos_brancos = 0;
        this.votos_nulos = 0;
    }
        
    public ContagemVotos(int total_votos, int votos_validos, int votos_brancos, int votos_nulos) {
        this.total_votos = total_votos;
        this.votos_validos = votos_validos;
        this.votos_brancos = votos_brancos;
        this.votos_nulos = votos_nulos;
    }
    
    /*
        Gets e Sets
    */
    
    public int getTotal_votos() {
        return total_votos;
    }

    public void setTotal_votos(int total_votos) {
        this.total_votos = total_votos;
    }

    public int getVotos_validos() {
        return votos_validos;
    }

    public void setVotos_validos(int votos_validos) {
        this.votos_validos = votos_validos;
    }

    public int getVotos_brancos() {
        return votos_brancos;
    }

    public void setVotos_brancos(int votos_brancos) {
        this.votos_brancos = votos_brancos;
    }

    public int getVotos_nulos() {
        return votos_nulos;
    }

    public void setVotos_nulos(int votos_nulos) {
        this.votos_nulos = votos_nulos;
    }
    
    /*
        Implementação de metodos
    */
    
    private boolean quantidadeValida(int valor){
        return valor > 0;
    }
    
    public int totalVotosValidos(){
        
        if (quantidadeValida(this.votos_validos) && quantidadeValida(this.total_votos))
        {
            return  (votos_validos*100/total_votos) ;
        }
        else
        {
            return 0;
        }            
    }
    
    public int totalVotosBrancos(){
        if (quantidadeValida(this.votos_brancos) && quantidadeValida(this.total_votos))
        {
            return  (votos_brancos*100/total_votos) ;
        }
        else
        {
            return 0;
        } 
    }
    
    public int totalVotosNulos(){
        if (quantidadeValida(this.votos_nulos) && quantidadeValida(this.total_votos))
        {
            return  (votos_nulos*100/total_votos) ;
        }
        else
        {
            return 0;
        } 
    }
}
