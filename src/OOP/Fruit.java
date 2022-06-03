package OOP;

public class Fruit {

    static  String type = "Food" ;
    String form ;
    String color ;

    public Fruit(String form , String color){
        this.form = form ;
        this.color = color ;
    }//parameterized constructor

    public  Fruit (){

    }//default constructor

    void insert (String f,String c){
        form = f;
        color = c;
    }
    public static void main(String[] args) {
        Fruit mango = new Fruit();
        mango.color = "Green";
        mango.form = "circle" ;

        Fruit apple = new Fruit();
        apple.insert("'circle" ,"Red");

        Fruit orange = new Fruit("round" , "Orange");
        System.out.println(orange.form);

        System.out.println(Fruit.type);
    }
}



//reference
//by method
//by constructor




//method = > static and instance
//constructor = > parameterized and default
