package Wrapper;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {


        String name = "AKS";
        String name1 = new String("AK");
        char[] chars = {'A', 'g', 'K', 'g', 'S', 'a', 'n'};
//        int[] ints = {1,2,3,4,5};
//        String name3 = new String(String.valueOf(ints));
        String name2 = new String(chars);
        char[] chars1 = name.toCharArray();
        System.out.println(Arrays.toString(chars1));

//        char [] chars2 = name3.toCharArray();
//        System.out.println(name3.toCharArray());

        String str1 = "hello";
        String str2 = "Hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str1.equals(str2));

        System.out.println(str1.equals(str3));

        System.out.println(str1 == str3);
        System.out.println(str1==str2);

        System.out.println("-------------");
        System.out.println(str3 == str4);

        System.out.println(str1.compareTo(str2));
        String str5 = "KS";
        String str6 = "AK";
        System.out.println(str5.compareTo(str6));

        System.out.println("A"+"K"+"S");
        System.out.println("Code".concat("wall"));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AUng");
        stringBuilder.append("is");
        System.out.println(stringBuilder);

        String str7 = "codewall technologies";
        String str8 = str7.substring(9);
        System.out.println(str8);
        String str9 = str7.substring(0,8);
        System.out.println(str9);

        String str10 = "Nilar Kyaw Myint";
        String str11[] = str10.split(" ");
        System.out.println(Arrays.toString(str11));
        System.out.println(str11[1]);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}



//String Comparison
//equals()
//==
//toCompare==compareTo

//String Concatenation == sar thar satt tr pr;
//+
//concat
//using stringBuilder

//String split
//subString