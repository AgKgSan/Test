package OOP;

public class ParameterizedMethod {

    int luckyNumber ;

    static ParameterizedMethod obj1(){
        return new ParameterizedMethod();
    }
    static int sum( int a){
        return a;

    }
    static void add (int a , int b){//parameter
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        add(3,5);//arguments
        add(6,7);
        int result = sum(45);
        System.out.println(result);
        ParameterizedMethod obj = new ParameterizedMethod();
        ParameterizedMethod obj2 = new ParameterizedMethod();
        System.out.println(obj.luckyNumber);

        System.out.println(obj);
        System.out.println(obj1());
        System.out.println(obj2);
    }
}
