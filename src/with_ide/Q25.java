package with_ide;

public class Q25 {
    public static void main(String[] args) {
        int row=6;
        for (int i= row; i>= 1; i--)
        {
            for (int j=row; j>i;j--)
            {
                System.out.print( i + " ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print(  " ");
            }
            System.out.println( "");
        }
    }
}
