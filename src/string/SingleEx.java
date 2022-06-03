package string;

class  A {
    public static final A instance = new A();
    private A(){

    }

    public static A getInstance() {
        return instance;
    }
}
public class SingleEx {
    public static void main(String[] args) {
        System.out.println(A.getInstance());
    }
}

//Singleton design pattern
