package HomeWork;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();
        double area = (3.142 * radius * radius );
        System.out.println( "Area of Circle"+ area );
    }
}
