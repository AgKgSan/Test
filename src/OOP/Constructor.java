package OOP;

public class Constructor {
    Constructor(){
        System.out.println("construct");
    }

    void Constructor (){
        System.out.println("method");
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
        obj.Constructor();
    }
}
