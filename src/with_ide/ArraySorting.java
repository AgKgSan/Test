package with_ide;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {
        Integer [] i = {5,4,1,8,6,9};
        System.out.println("Before" + Arrays.toString(i));

        Arrays.sort(i);
        System.out.println("After Sort" + Arrays.toString(i));


        Arrays.sort(i,Collections.reverseOrder());
        System.out.println("After reverse" + Arrays.toString(i));
    }
}
