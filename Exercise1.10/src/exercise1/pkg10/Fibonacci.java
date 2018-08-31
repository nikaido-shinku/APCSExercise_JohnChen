
package exercise1.pkg10;
public class Fibonacci {
    private int value;
    private boolean even = false;
    public void StoreValue(int x){
        this.value = x;
    }
    public void StoreEven(){
        this.even = true;
    }
    public int FetchValue(){
        return value;
    }
    public boolean FetchEven(){
        return even;
    }
    
}
