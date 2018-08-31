
public class Fibonacci {
    int value;
    boolean even = false;
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

