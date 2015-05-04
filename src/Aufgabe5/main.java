/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aufgabe5;
import Aufgabe5.Liste;
import Aufgabe5.Vehicle.Color;

/**
 *
 * @author 1410653475
 */
public class main {
    public static void main(String[] args) throws Exception{
        Liste<absBenennbar> l =  new Liste(3);
        absBenennbar a = new Car();
        absBenennbar b = new Boat();
        absBenennbar c = new Vehicle();
        
        l.save(a);
        l.save(b);
        l.save(c);
        l.save(200.0);

        System.out.println(a.toString());
        
    }
    
}
