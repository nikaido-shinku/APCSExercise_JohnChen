/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg7;

/**
 *
 * @author 1
 */
public class Exercise17 {
  static final int MAX_INDEX = 9;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int lo =1;
      int hi =1;
      String mark;
      System.out.println("10: " + lo);
        for (int i = MAX_INDEX; i > 0; i--) {
            if (hi % 2 ==0)
                mark = " *";
            else
                mark = "";
            System.out.println(i + ":" + hi + mark);
            hi = lo + hi;
            lo = hi - lo;
            
        }
      
    }
    
}
