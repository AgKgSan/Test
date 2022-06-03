package HomeWork;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1 = input.nextInt();

        System.out.println("Enter num2 ");
        int num2 = input.nextInt();

        Scanner operator = new Scanner(System.in);
        System.out.println("Click Enter ");

        String operation = operator.next();

        if (operation == "+");{
            System.out.println("Operation is " + ( num1 + num2 ));
        }
        if (operation == "-");{
            System.out.println("Operation is " + ( num1 - num2 ));
        }
        if (operation == "*");{
            System.out.println("Operation is " + (num1 * num2));
        }
        if (operation == "/");{
            System.out.println("Operation is " + ( num1 / num1 ));
        }
    }
}
