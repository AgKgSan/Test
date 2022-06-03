package with_ide;

import java.util.Arrays;

public class DeleteArrayPosition {

    public static int[] deleteByIndex ( int[] array , int indexNum){
        int [] dBI = new int[array.length-1];
        System.arraycopy(array,0,dBI,0,indexNum);
        if (array.length!=indexNum){
            System.arraycopy(array,indexNum+1,dBI,indexNum,array.length-indexNum-1);
        }
        return dBI;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println("before "+ Arrays.toString(array));

        int indexNum = 2 ;
        array = deleteByIndex(array,indexNum);
        System.out.println(Arrays.toString(array));

    }
}
