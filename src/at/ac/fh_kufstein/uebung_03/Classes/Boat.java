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
public class Boat extends Vehicle {
    
    private double Tiefgang;

    public double getTiefgang() {
        return Tiefgang;
    }

    public Boat(double Tiefgang, short Schrauben, double Ladung, short wheels, Color f, short ps, short doors) {
        super(wheels, f, ps, doors);
        this.Tiefgang = Tiefgang;
        this.Schrauben = Schrauben;
        this.Ladung = Ladung;
    }


    public void setTiefgang(double Tiefgang) {
        this.Tiefgang = Tiefgang;
    }

    public short getSchrauben() {
        return Schrauben;
    }

    public void setSchrauben(short Schrauben) {
        this.Schrauben = Schrauben;
    }

    public double getLadung() {
        return Ladung;
    }

    public void setLadung(double Ladung) {
        this.Ladung = Ladung;
    }
    private short Schrauben;
    private double Ladung;
    
    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat "+getPs()+" PS und einen Tiefgang von "+getTiefgang()+"m";
    }
    
    void entladen() throws InterruptedException{
        this.Ladung=0.0;
        
        Thread.sleep(5000);
    }
    
    
    
}
