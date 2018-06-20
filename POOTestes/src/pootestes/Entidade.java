/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootestes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
     
   /*
     deverá calcular um Map de atividade para lista de atividades. 
     exemplo: saude, [2, 4, 5,9] 
     */  
     public Map <Atividade, List<Fatura>> FaturasporAtividade(){
          Map <Atividade, List<Fatura>> faturasPorAtividade = new HashMap<>(); 
          List<Fatura> fat = new ArrayList<>(); 
 
          
          for(Fatura f : this.faturas.values()){
              fat.add(f); //listas de faturas 
              
              for (Atividade a : fat.get(f.getAtividade())){
                  
              }
              
              faturasPorAtividade.put(a, fat); 
              
          }
          return faturasPorAtividade; 
     }
          
                
}

