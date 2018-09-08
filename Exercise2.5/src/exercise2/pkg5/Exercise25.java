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
public class Exercise25 {
    static final int MAX = 9;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle[] vlist = new Vehicle[MAX];
        for (int i = 0; i < MAX; i++) {
        Vehicle v = new Vehicle();
        vlist[i]= v;
        }
        for (int i = 0; i < MAX; i++) {
            System.out.println("vehicle's id is:" + vlist[i].ID);
            
        }
        // TODO code application logic here
    }
    
}
