package HomeWork;

import java.util.Scanner;

public class CToF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter C");
        double C = input.nextDouble();

        double F = (C * 1.8 ) + 32 ;
        System.out.println(" C to F is "  + F);

        System.out.println("Enter F");
        double F1 = input.nextDouble();

        double C1 = ((F1 - 32)*5)/9 ;
        System.out.println( " F to C is " + C1);
    }
}
