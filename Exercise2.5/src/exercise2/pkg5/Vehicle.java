/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2.pkg5;

/**
 *
 * @author 1
 */
public class Vehicle {
    public double speed;
    public double degree;
    public String ownername;
    public static int nextID = 0;
    public final int ID;
    public Vehicle (){
        ID = nextID;
        nextID += 1;        
    }
}
