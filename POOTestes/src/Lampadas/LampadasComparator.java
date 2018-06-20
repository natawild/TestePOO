/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lampadas;

import java.util.Comparator;
import java.util.Set;

/**
 *
 * @author Celia
 */
public class LampadasComparator implements Comparator<String>{
    private Set<String> conjunto; 
    
    public LampadasComparator(Set<String> set) {
        this.conjunto = set;
    }
    
     public int compare(String a, String b) {
       
        return 0 ; 
     }
    
}

