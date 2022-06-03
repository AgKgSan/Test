package basics;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int a = 7 ;
        int [] numbers = {1,2,4,5,7,8,9};

        String []friuts = {"One","apple","orange","pineapple"};
        System.out.println(friuts[2]);
        System.out.println(numbers[6]);
        System.out.println(numbers.length);
        System.out.println(numbers[numbers.length-1]);
        ArrayList list = new ArrayList<>();
        list.add("one");
        list.add("apple");
        System.out.println(Arrays.toString(numbers));
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]+"");
        }
        


    }
}
