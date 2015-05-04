/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aufgabe3;

/**
 *
 * @author 1410653475
 */
public class Vehicle extends absBenennbar {
    short wheels;
    Color f;
    public enum Color{BLACK,SILVER,RED,GREY,YELLOW,Blue}
    short ps;
    short doors;
    boolean gestartet=false;
    short geschwindigkeit=0;

    public Vehicle(short wheels, Color f, short ps, short doors) {
        this.wheels = wheels;
        this.f = f;
        this.ps = ps;
        this.doors = doors;
        
    }

    public Vehicle() {
    }

    public short getWheels() {
        return wheels;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public Color getF() {
        return f;
    }

    public void setF(Color f) {
        this.f = f;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getDoors() {
        return doors;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public boolean isGestartet() {
        return gestartet;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }
    
    void start(){
        this.gestartet = true;
    }
    
    void stop(){
        this.gestartet = false;
    }
    
    void accerlerate(short speed){
        if(this.gestartet == true&& ((speed+this.geschwindigkeit)<=250)){
            this.geschwindigkeit+=speed;
        }
    }
    
    void bremsen(short speed){
        if(this.gestartet == true&& ((this.geschwindigkeit-speed)<=0)){
            this.geschwindigkeit-=speed;
        }
    }
    
}
