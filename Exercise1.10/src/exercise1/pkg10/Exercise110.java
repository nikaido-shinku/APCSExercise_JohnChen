package exercise1.pkg10;


public class Exercise110 {
static final int MAX_INDEX = 9;

public static Fibonacci[] GenFibonaccis(){
    int lo =1;
    int hi =1;
    Fibonacci one = new Fibonacci();
    one.StoreValue(hi);
    Fibonacci [] Fserie= new Fibonacci[10];
    Fserie[0] = one;
    for (int i = 1; i < MAX_INDEX; i++) {
        Fibonacci fb = new Fibonacci();
        hi = lo + hi;
        lo = hi - lo;
        if (hi % 2 ==0)
            fb.StoreEven();
        fb.StoreValue(hi);
        Fserie[i] = fb;
    }
        return Fserie;
}
public static void printFibonaccis(Fibonacci[] Fserie){
    for (int i = 0; i < 9; i++) {
        String mark;
        int value;
        boolean even =false;
            value = Fserie[i].FetchValue();
            even = Fserie[i].FetchEven();
            if (even == true) mark = "*";
            else mark = "";
            System.out.println(value + ""+ mark);   
        }
}
    public static void main(String[] args) {
        Fibonacci[] Fserie = GenFibonaccis();
        printFibonaccis(Fserie);
    }
    
}
