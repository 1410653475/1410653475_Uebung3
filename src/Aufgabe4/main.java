/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aufgabe4;

/**
 *
 * @author 1410653475
 */
public class main {
    public static void main(String[] args) throws Exception{
        Liste test = new Liste(3);
        test.save(2.0);
        test.save(5.0);
        test.save(200.0);
        
        
        for(int i =0;i<test.getSize();i++){
            System.out.println((test.getSize()-i)+". Stelle im Speicher: "+test.Pop());
        }

        
    }
    
}
