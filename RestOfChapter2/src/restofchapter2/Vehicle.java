/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restofchapter2;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 *
 * @author 1
 */
public class Vehicle {
    //exercise 2.13 ask for change fields to private
    private double speed = 3.0;
    private double degree = 4.0;
    private String ownername = "";
    private static int nextID = 0;
    private final int ID;
    private static int maxID;
    private final double TURN_LEFT = 45.0;
    private final double TURN_RIGHT = -45.0;
    public void changeSpeed (double s){
        this.speed = s;
    }
    public void changeDegree(double d){
        this.degree = d;
    }
    public void transferOwner(String... names){
        this.ownername = "";
        for (int i = 0; i < names.length; i++) {
        this.ownername += names[i];    
        }
    }
    public double fetchSpeed(){
        return speed;
        
    }
    public double fetchDegree(){
        return degree;
    }
    public String fetchName(){
        return ownername;
    }
    public int fetchID(){
        return ID;
    }
    public Vehicle (String... names){
        for (int i = 0; i < names.length; i++) {
        ownername += names[i];    
        }
        ID = nextID;
        nextID += 1;       
        maxID = ID;
    }
    public Vehicle (){
        ID = nextID;
        nextID += 1;   
        maxID = ID;
    }
    public static int MaxId(){
        return  maxID;
    }
    public String toString() {
        String string = ID + " (" + ownername + ")";
        return string;
    }
    public void Stop(){
        this.speed = 0;
    }
    public void turn(double deg){
        this.degree += deg;
    }
    public void turnLeft(){
        this.degree += this.TURN_LEFT;
    }
    public void turnRight(){
        this.degree += this.TURN_RIGHT;
    }
}
