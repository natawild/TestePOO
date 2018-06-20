/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pontos;

import java.util.List;

/**
 *
 * @author Celia
 */
public class Poligono {
    private List<Ponto> listaPontos; 
    
    /*
    Construtor parametrizado
    */
    public Poligono(List<Ponto> listaP){
        this.listaPontos=listaP; 
        
    }
    
    public void addPonto(Ponto p){
        this.listaPontos.add(p.clone()); 
    }
    
    public boolean eFechada(){
        boolean eFechada = false; 
        
        
        return eFechada;
    }
    
    public double perimetro(){
        double perimetro = 0; 
        
        return perimetro; 
    }
    
}
