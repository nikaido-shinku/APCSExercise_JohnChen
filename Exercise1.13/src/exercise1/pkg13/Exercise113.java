/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg13;

/**
 *
 * @author 1
 */
public class Exercise113 {
     static final int MAX_INDEX = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lo =1;
        int hi =1;
        String mark;
        System.out.printf("1: %3d \n" , lo);
        for (int i = 2; i < MAX_INDEX; i++) {
            if (hi % 2 ==0)
                mark = " *";
            else
                mark = "";
            System.out.printf("%d :%3d %s \n",i,hi,mark);
            hi = lo + hi;
            lo = hi - lo;
            
        }
        // TODO code application logic here
    }
    
}
