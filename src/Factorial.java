public class Factorial {

    public static void main(String args[])
    {
        factorial((6));
    }

    static void factorial(int num)
    {

        int fact=1;
        for(int i=num; i>=1; i--)
        {
           fact = fact*i;
        }

        System.out.println(fact);
    }

}
