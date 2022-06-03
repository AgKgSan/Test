package with_ide;

import java.util.Arrays;

public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};

        System.out.println("Before" + Arrays.toString(array));
        int[] array1 = new int[array.length-1];
        int deleteElement = 3 ;
        for(int i = 0 ,k =0 ; i< array.length; i++){
            if (array[i]!=deleteElement){
                array1[k] = array[i];
                k++;
            }
        }
        System.out.println("After delete"+Arrays.toString(array1));
    }
}