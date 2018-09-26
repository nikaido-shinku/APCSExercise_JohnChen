/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restofchapter2;

/**
 *
 * @author 1
 */
public class RestOfChapter2 {
static final int MAX = 9;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        LinkedList l1 = new LinkedList(10);
        //changed due to making content and next private
        System.out.println(l1.fetchLength(l1));
        Vehicle[] vlist = new Vehicle[MAX];
        for (int i = 0; i < MAX; i++) {
        Vehicle v = new Vehicle("john","chen");
        vlist[i]= v;
        }
        for (int i = 0; i < MAX; i++) {
            System.out.println("vehicle's id is:" + vlist[i].fetchID() + " vehicle's owner is:" + vlist[i].fetchName());
        }
        Integer[] b = {1,2,3,4,5,6,7,8,9};
        LinkedList a = new LinkedList(b);
        }
     
      
    
    }
    

