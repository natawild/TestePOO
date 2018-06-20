/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lampadas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Celia
 */
public class CasaInteligente {
    private Map<String,Lampada> lampadas; 
    
    
    public CasaInteligente (List<Lampada> novasLampadas){
        for (Lampada l : this.lampadas.values()){
            List<Lampada> novas = new ArrayList<>(); 
            novas.add((Lampada) novasLampadas); 
        }  
    }
    
    
    /*
    Determina quantas lampadas é que estão ligadas em modo Economico
    */
    public int qtEmEco(){
      int modoEco=0;
      for(Lampada l : this.lampadas.values()){
            if(l.getEstado()==2){
            modoEco++; 
        }
      }
      return modoEco; 
    }
    
    
    public void removeLampada(String id) throws LampadaInexistenteException{
        if(this.lampadas.containsKey(id)){
         this.lampadas.remove(id); 
        }
        else{
            throw new LampadaInexistenteException(id); 
        }
    }
    
    
    /*
    Determina o consumo total da casa
    */
    public double consumoTotal(){
        double consumoTotal=0.0;
        for(Lampada l : this.lampadas.values()){
            
            consumoTotal+= l.totalConsumo(); 
        }
        
        return consumoTotal; 
    }
    
    
    
    /*
    Devolve o conjunto das x lampadas que mais gastam 
    */
    public Set<String> topConsumo(int x){
       Set<String> conjunto = new TreeSet<>(); 
       for(Lampada l : this.lampadas.values()){//percorre as lampadas 
            conjunto.add(l.getIdent()); 
            double consumo = l.totalConsumo(); //guarda o consumo da lampada 
           if(conjunto.size()<x){
           }
       }
       return conjunto;   
    }
    
    
}
