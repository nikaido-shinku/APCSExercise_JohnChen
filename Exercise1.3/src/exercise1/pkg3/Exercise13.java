/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg3;

/**
 *
 * @author 1
 */
public class Exercise13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lo =1;
        int hi =1;
        System.out.println("Fibonacci");
        System.out.println(lo);
        while(hi<50){
            System.out.println(hi);
            hi = lo+ hi;
            lo = hi - lo;
        }
        // TODO code application logic here
    }
    
}
