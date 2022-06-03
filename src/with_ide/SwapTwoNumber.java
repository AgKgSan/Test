package with_ide;

public class SwapTwoNumber {

    static  void swapValues (int a , int b ){
        int c = a ;
        a = b ;
        b = c ;
        System.out.println("The value of a is " + a +" And the value of b is " + b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        swapValues(a,b);
    }
}
