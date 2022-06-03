package basics;

import java.io.Console;


public class UserInput1 {
    public static void main(String[] args) {



        Console csol = System.console();
        System.out.println("Enter a number...");
        int userInput = Integer.parseInt(csol.readLine());
        //String userInput = console.readLine();
        System.out.println("Your name is"+ userInput);
    }
}
