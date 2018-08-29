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
public class Exercise18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Point one = new Point();
       Point two = new Point();
       one.x = 1.1;
       one.y = 2.2;
       two.x = 3.3;
       two.y = 4.4;
       one.move(5.5, 6.6);
       two.clear();
       double d = two.distance(one);
        System.out.println("the distance is :" + d);
       two.symphosize(one);
        System.out.println("point two's coordinate is:" + two.x + "|"+ two.y);
        // TODO code application logic here
    }
    
}
