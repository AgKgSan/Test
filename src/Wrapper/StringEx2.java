package Wrapper;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {
        String str = "Daw Hla Hla";
        byte b[] = str.getBytes();
        System.out.println(Arrays.toString(b));

        System.out.println(str.isEmpty());
        System.out.println(str.charAt(4));
        System.out.println(str.indexOf("H"));
        System.out.println(str.lastIndexOf("H"));

        int num1 =str.codePointAt(3);
        System.out.println(num1);

        System.out.println(str.endsWith("@gmail.com"));
        System.out.println(str.startsWith("Daw"));

    }
}
