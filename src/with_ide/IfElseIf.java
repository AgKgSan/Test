package with_ide;

public class IfElseIf {
    public static void main(String[] args) {
        int num1 = 23 ,num2 = 24 , num3 = 12 , num4 = 78 , num5 = 62 ;
        if ( num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5){
            System.out.println("The largest number is " + num1);
        } else if (num2>=num1 && num2 >= num3 && num2>= num4 && num2>=num5) {
            System.out.println("The largest number is" + num2);
        }
        else if (num3>=num1 && num3 >= num2 && num3>= num4 && num3>=num5) {
            System.out.println("The largest number is" + num3);
        }
        else if (num4>=num1 && num4 >= num2 && num4>= num3 && num4>=num5) {
            System.out.println("The largest number is" + num4);
        }
        else if (num5>=num1 && num5 >= num2 && num5>= num3 && num5>=num4) {
            System.out.println("The largest number is" + num5);
        }

    }
}
