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
public class LampadaWriteFail extends Exception{
      /**
     * Construtor vazio, ou seja, apenas invoca o construtor da superclasse.
     */
    public LampadaWriteFail(){
        super();
    }
    
    /**
     * Construtor parametrizado, ou seja, recebe uma String como parâmetro para informação, que invoca igualmente o construtor da superclasse que aceita uma String por parâmetro.
     */
    public LampadaWriteFail(String message){
        super(message);
    }
    
    /**
     * A função getMessage imprime o texto de exceção.
     */
    public String getMessage() {
        return "Falhou a escrita no ficheiro!\n";
    }
    
}
