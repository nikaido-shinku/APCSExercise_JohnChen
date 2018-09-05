/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg12;

/**
 *
 * @author 1
 */
public class Exercise112 {
 static final int MAX_INDEX = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int lo =1;
      int hi =1;
      String mark;
      String febsString = "1: " + lo;
      System.out.println("1: " + lo);
        for (int i = 2; i < MAX_INDEX; i++) {
            if (hi % 2 ==0)
                mark = " *";
            else
                mark = "";
            System.out.println(i + ":" + hi + mark);
            febsString += i + ":" + hi + mark;
            hi = lo + hi;
            lo = hi - lo;
            
        }
        char [] febseq = febsString.toCharArray();
    }
    
}
