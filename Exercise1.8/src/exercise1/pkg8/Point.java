/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg8;

/**
 *
 * @author 1
 */
public class Point {
    public double x, y;
    public static Point origin = new Point();
    public void clear() { 
        this.x = 0.0;   
        this.y = 0.0;
    }
    public double distance(Point that) {    
        double xdiff = x - that.x;   
        double ydiff = y - that.y;   
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }
    public void move(double x, double y) { 
        this.x = x;    
        this.y = y; 
    }
   
    //the actual homework
    public void symphosize(Point P){
        this.x = P.x;
        this.y = P.y;
    }
 
    
}
