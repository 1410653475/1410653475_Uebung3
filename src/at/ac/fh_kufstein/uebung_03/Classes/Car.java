/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein.uebung_03.Classes;

/**
 *
 * @author 1410653475
 */
public class Car extends Vehicle {

    public boolean isKlimaanlage() {
        return Klimaanlage;
    }

    public void setKlimaanlage(boolean Klimaanlage) {
        this.Klimaanlage = Klimaanlage;
    }

    public Car() {
    }



    public Car(short Airbags, short wheels, Color f, short ps, short doors) {
        super(wheels, f, ps, doors);
        this.Airbags = Airbags;
    }



    public short getAirbags() {
        return Airbags;
    }

    public void setAirbags(short Airbags) {
        this.Airbags = Airbags;
    }
    
    private boolean Klimaanlage=false;
    private short Airbags;
    
            
    void klimaanlageAn(){
        if(this.Klimaanlage==false){
            this.Klimaanlage=true;
        }else{
            System.out.println("Klima läuft bereits!");
        }
    }
    
    void klimaanlageAus(){
        if(this.Klimaanlage==true){
            this.Klimaanlage=false;
        }else{
            System.out.println("Klima bereits aus!");
        }
    }
    
    @Override
    public String toString() {
        return "Mein Auto hat "+getPs()+" PS und fährt mit "+getGeschwindigkeit()+" km/h";
    }
    
}
