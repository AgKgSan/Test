package OOP;

public class Person {
    //static String schoolName = "1";//bone 2 nay yin static 3
    String name;
    int age;

//    int a ;
//    int b ;


     void insert(String n , int a){ //parameter
//        int a = 13 ;
//        int b = 12 ;
        name = n ;
        age = a ;

//        System.out.println("result is" +( a+b ));
    }
    public static void main(String[] args) {
        Person person = new Person(); // object initialize
        System.out.println(person.name);
        person.insert("AKS",22);
        System.out.println(person.name);
        System.out.println(person.age);

//        person.name = "AKS";
//        person.age = 22;
//
//        Person person1 = new Person();
//        person1.name = "Blah";
//        person1.age = 22 ;
    }
}
//reference
//method
//