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
public class Liste {
    private int size;
    private Object[] elements;
    private int pointer = 0;
    
    public Liste(double size){
        this.size=(int)size;
        elements = new Object[this.size];
    }
    
    public void save(Object element) throws Exception{
        if(pointer>=this.size){
            throw new Exception("Voll!");
        }else{
            this.elements[pointer++]=element;
        }
    }
    
    public Object Pop() throws Exception{
        if(--pointer >=0){
            return elements[pointer];
        }else{
            pointer = 0;
            throw new Exception("Leer");
        }
    }

    public int getSize() {
        return size;
    }
    
    
    
    
    
    
    
}
