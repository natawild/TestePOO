/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lampadas;

import java.time.LocalDateTime;

/**
 *
 * @author Celia
 */
public class Lampada {
    private String ident; 
    private LocalDateTime inicio; 
    private LocalDateTime parcial; 
    private double consumoLigada; 
    private double consumoEco; 
    private double consumoTotal; 
    private double consumoParcial; 
    private int estado; 
    
    
    public int getEstado(){
        return this.estado; 
    }
    
    
    public Lampada(String ident, double consumoLigada,double consumoEco ){
        
    }
    
    public void lampON(){
        
    }
    
    public void lampEco(){
        
    }
    
    
    public double totalConsumo(){
        double res=0; 
        return res;   
    }
    
    public double periodoConsumo(){
        double res=0.0; 
        return res; 
    }
    
    public void efetuarResetConsumo(){
    
    }
    
    
}
