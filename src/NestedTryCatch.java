import java.lang.reflect.Array;
import java.util.Scanner;

public class NestedTryCatch {

    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of array to print");
        int i = sc.nextInt();

        try{

            if(i>4)
            {
                throw new ArrayIndexOutOfBoundsException("Index out of bounds");
            }

            try{

                if(i==0)
                {
                    throw new ArithmeticException("Division by zero");
                }

                System.out.println(30/i);
            }catch (ArithmeticException e)
            {
                System.out.println(e);
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
