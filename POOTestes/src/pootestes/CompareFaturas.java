/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootestes;

/**
 *
 * @author Celia
 */
public class CompareFaturas {
    public int compareTo(Fatura f){
        Fatura a = null; 
        if(a.getData()==f.getData()) return 0; 
        if(a.getData().isBefore(f.getData())) return 1; 
        else return -1;   
        }
}
