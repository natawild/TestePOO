/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootestes;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Celia
 */
public abstract class Entidade
{
    private String nif; 
    private String nome;
    private Map<LocalDate,Fatura> faturas ;
    
    
    public String getNome () {
        return this.nome;
    }
    
    public String getNif(){
        return this.nif; 
    }
    
     public Map<LocalDate, Fatura> getFaturas(){
         Map<LocalDate, Fatura> mapFaturas = new HashMap<>(); 
         for(LocalDate key : this.faturas.keySet()){
             Fatura f = this.faturas.get(key);
             mapFaturas.put(key,f);
            }
    
        return mapFaturas; 
    }
}

