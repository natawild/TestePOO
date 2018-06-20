/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootestes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author Celia
 */
public class Negocio {

    private Map<String, Contribuinte> contribuintes; 
    
    /*deverá escrever no ficheiro com nome nomeFich, linhas de texto com o Nome, NIf, e o valor da redução de iMposto de todos 
     * os contribuintes que sejam bonificados. Sabendo que no futuropoderão ser adicinados mais sub-tipos de Contribuinte 
     * desenvolva uma solução genérica. Não se esqueça de considerar as exepções relevantes
     */
    public void  printFamiliasNumerosa (String nomeFich) throws IOException{
        FileWriter fw = new FileWriter (nomeFich);
        for(Contribuinte c : this.contribuintes.values()){ //contribuintes  
            for(Contribuinte cd : c.getDependentes()){//contribuinte com dependentes
                FamiliaNumerosa f = (FamiliaNumerosa) cd; 
                if(f instanceof Bonificado){
                    fw.write("Nome:"+ cd.getNome());
                    fw.write("NIf:"+ cd.getNome());
                    fw.write("Redução: "+ f.reducaoImposto());
                    fw.flush();
                    fw.close();
                 
                }
            }
       
        }
    
    }
}
