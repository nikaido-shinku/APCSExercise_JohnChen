/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg9;

/**
 *
 * @author 1
 */
public class Exercise19 {
static final int MAX_INDEX = 9;
    /**
     * @param args the command line arguments
     */
     public static int[] store (){
     int lo =1;
      int hi =1;
      int[] Feb = new int[10];
      Feb[0] = 1; 
        for (int i = 1; i <= MAX_INDEX; i++) {
            Feb[i] = hi;
            hi = lo + hi;
            lo = hi - lo;

        }
               System.out.println("stored successfully");
        return Feb;
}
     public static void print(int [] x){
         System.out.println("Printing");
         for (int g = 0; g < x.length; g++) {
            System.out.println(x[g]);
            
        }
     }
    public static void main(String[] args) {
        // TODO code application logic here
     int[] feb= store();
        print(feb);
        
    }
    
}
