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
                for(Fatura f : this.faturas.values()){
                    Atividade actividade = f.getAtividade();
                    List<Fatura> fats = faturasPorAtividade.get(actividade);
                    if(fats == null) { // inda nao tinhas encontrado esta atividade da lista, 
                    //tens então que criar uma lista para esta actividade e adcionar aqui as faturas desta actividade
                        fats = new ArrayList<Fatura>();
	        	//agora que tens a lista criada para esta actividade. Adicionas a fatura
	        	fats.add(f.clone()); 
                        //por fim tens de adicionar a lista de faturas que criaste para esta atividade ao MAP
	        	faturasPorAtividade.put(actividade, fats); 
	        	}
                    else { //a actividade da fatura que estas a ver neste momento ja entrei no if anterior. Ou seja a lista de 
                        //faturas para esta actividade já foi criada
                        //então so tens de adicionar mais um elmento a lista
	        	fats.add(f.clone()); 
                    }
	          }
	          return faturasPorAtividade; 
	}
                       
}

