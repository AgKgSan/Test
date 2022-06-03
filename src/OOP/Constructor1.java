package OOP;

public class Constructor1 {

    Constructor1 (){
        System.out.println("default");
    }

    Constructor1 (int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        new Constructor1(12);
    }
}
