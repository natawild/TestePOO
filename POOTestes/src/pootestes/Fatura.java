/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootestes;

import java.time.LocalDate;

/**
 *
 * @author Celia
 */
public class Fatura
{
    private String numero; 
    private LocalDate data; 
    private double valor; 
    private Atividade atividade; 
    
    public Fatura(){
        this.numero= "";
        LocalDate data= null; 
        this.valor = 0.0; 
        this.atividade = new Atividade() ;     
    }
    
    public Fatura (Fatura a){
        this.numero = a.getNumero();
        this.data = a.getData();
        this.valor = a.getValor();
        this.atividade = a.getAtividade();
    }
    
     public LocalDate getData (){
        return this.data; 
    }
    
    
    public String getNumero(){
        return this.numero; 
    }
    
    
    public double getValor(){
        return this.valor; 
    }
    
    
     public Atividade getAtividade(){
        return this.atividade; 
    
    }
}
