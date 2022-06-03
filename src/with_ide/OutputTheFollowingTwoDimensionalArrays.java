package with_ide;

import java.util.Arrays;

public class OutputTheFollowingTwoDimensionalArrays {
    public static void main(String[] args) {

        int [][] twoD = {
                {1,2,3,4,5},
                {5,4,3,2,1},
                {7,8,9,1,5,7,7}
        };

        for (int [] ints :twoD){
            System.out.println(Arrays.toString(ints));
        }
    }
}
