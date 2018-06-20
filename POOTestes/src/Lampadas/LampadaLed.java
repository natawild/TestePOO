/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lampadas;

/**
 *
 * @author Celia
 */
public class LampadaLed extends Lampada{
    float parametro; 

    public LampadaLed(String ident, double consumoLigada, double consumoEco, float parametro) {
        super(ident, consumoLigada, consumoEco);
        this.parametro= parametro; 
    }
    
    public void gravaObj(String nomeFich, int lampadas) throws LampadaWriteFail{
        
        
    }
    
}
