package basics;

import java.util.Scanner;

public class UserOutput {
    public static void main(String[] args) {
        System.out.println("Enter your name :");
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());

        String name = scanner.nextLine();
        System.out.println(name);

        int number = scanner.nextInt();
        System.out.println(number);
    }
}
