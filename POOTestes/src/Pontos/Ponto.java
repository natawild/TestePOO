/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pontos;

/**
 *
 * @author Celia
 */
public class Ponto {
     private double x;
     private double y;
    
     
     /*Construtor por cópia*/
    public Ponto (double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public double getX(){ 
        return x; 
    }
    
    public double getY(){ 
        return y; 
    }
 
    
    public double distancia (Ponto p){
        double distancia=0; 
        distancia = Math.sqrt( Math.pow( (this.x - p.getX()),2 ) +
                               Math.pow( (this.y - p.getY()),2 ) );
        return distancia; 
        
    }
    
    //clone
    public Ponto clone (){
        return new Ponto(x,y);    
    }
    
}
