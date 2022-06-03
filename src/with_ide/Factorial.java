package with_ide;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {


        int i;
        int fact = 1 ;
        int number = 5;
        for ( i = 1 ; i <= number ; i++){
            fact = fact * i ;
        }
        System.out.println("The Fact of " + number + " is "+fact );
    }
}
