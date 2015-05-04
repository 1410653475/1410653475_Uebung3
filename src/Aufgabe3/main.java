/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aufgabe3;
import Aufgabe3.Vehicle.Color;

/**
 *
 * @author 1410653475
 */
public class main {
    public static void main(String[] args){
        
        Car bmw = new Car((short)4,(short)4,Color.BLACK,(short)220,(short)5);
        Car audi = new Car((short)8,(short)4,Color.SILVER,(short)180,(short)5);
        
        Boat titanic = new Boat(10.54, (short)3, 100000.0, (short)0, Color.Blue, (short)51000, (short)0);
        
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(titanic);
        
        absBenennbar namedCar = new Car();
        
        namedCar.setName("7er Golf");
        
        System.out.println(namedCar.getName());
        
    }
    
}
