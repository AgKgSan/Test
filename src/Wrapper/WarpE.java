package Wrapper;

import java.util.SortedMap;
class  Custom{
    int a;
    Custom (int i){
        a= i;
    }

    @Override
    public String toString() {
        return String.valueOf(a);
    }
}
public class WarpE {
    public static void main(String[] args) {
        int a = 223 ;
        System.out.println(a);

        String str = "Hello";
//        String str2 =
        System.out.println(a+5);

        Integer num1 = a ;
        Integer num2 = Integer.valueOf("89");

        String val = num1.toString()+5;
        System.out.println(num1.toString() + 5);
        System.out.println(num1+5);
        System.out.println(val.length());
        System.out.println(num2);

        Integer num23 =12;
        Integer num4 = 45 ;

        Boolean b = true ;
        double num5 = num4 ;
        int num6  = num4.intValue();
        Custom custom = new Custom(56);
        System.out.println(custom);
    }
}
//Byte
///Short
//Integer
//Long
//Float
//Double
//Boolean
//Char