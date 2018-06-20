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
public class FamiliaNumerosa extends Contribuinte implements Bonificado  {
    
    public FamiliaNumerosa (){
        super(); 
    }
    
    public double reducaoImposto(){
        double a =0.4; 
        return a; 
    }
}
