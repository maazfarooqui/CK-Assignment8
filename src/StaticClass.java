import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StaticClass {

    public static void main(String args[])
    {

    ArrayList <Integer>  arr = new ArrayList<>();
    Collections.addAll(arr,21,44,61,67,11,8);
        System.out.println(MathUtils.max(arr));
        System.out.println( MathUtils.min(arr));
        System.out.println( MathUtils.avg(arr));
    }

    static class MathUtils{

        public static int max(ArrayList<Integer> arr)
        {
            int maxNumber = Collections.max(arr);
            return maxNumber;
        }

        public  static int min(ArrayList<Integer> arr)
        {
            int minNumber = Collections.min(arr);
            return minNumber;
        }

        public static float avg(ArrayList<Integer> arr)
        {

            int sum=0;
            for (Integer integer : arr) {
                sum += integer;
            }
            float average = (float)sum /(arr.size());
            return average;
        }
    }
}
