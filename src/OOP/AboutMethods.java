package OOP;

public class AboutMethods {
    int a ;// variable declaration

    static  String message(){
        return "hello";
    }

    static  int number(){
        System.out.println("Blah Blah Blah ...");
        return 22 ;
    }


    static void show(){
        System.out.println("Show method is working");
    }//instance method
    public static void main(String[] args) {
        show();
        System.out.println(" Your message is " + message());
        System.out.println(number());
    }//top level method
}
