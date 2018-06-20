/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootestes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Celia
 */
public class Contribuinte extends Entidade
{
    private List<Contribuinte> dependentes; 
    
    public Contribuinte (){
        super(); 
    }
    
    public List<Contribuinte> getDependentes(){
        List<Contribuinte>  ola = new ArrayList<>(); 
        for(Contribuinte c : this.dependentes){
            ola.add(c); 
        }
        return ola ; 
    }
}