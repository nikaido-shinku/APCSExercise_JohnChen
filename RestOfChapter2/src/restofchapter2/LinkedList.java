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
public class LinkedList {
    private Object content;

    private LinkedList next;
    public void storeContent(Object obj){
        this.content = obj;
    }
   
    public Object fetchContent(){
        return content;
    }
    public LinkedList(int length){
        if(length > 1)
        this.next = ( new LinkedList(length-1));
    }
    public LinkedList(){
        
    }
    public int fetchLength(LinkedList list){
        int count = 1;
        while (list.next != null) {
            list = list.next;
            count += 1;
        }
        return count;
    }
    public String toString() {
        String string = content.toString();
        if (this.next != null) string += "next:" + this.next.content.toString();
        return string;
    }
    public LinkedList(Object[] array){
        for (int i = 0; i < array.length; i++) {
            LinkedList x = new LinkedList();
            this.content = array[i];
            x = this;
            System.out.println(x.content);
            this.next = x;
            System.out.println("Next: " + this.next);
            System.out.println("Content: " + this.content);
            System.out.println("break");
            
            
        }
       
    }
}
