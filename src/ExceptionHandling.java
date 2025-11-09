public class ExceptionHandling {

    public static void main(String args[])
    {
            division(77,9);
            division(54,0);
    }

    static void division(int a, int b)
    {

        try{
           int result = a/b;
            System.out.println("result is: " +result);
        }catch (ArithmeticException e)
        {
            System.out.println(e);
        }finally {
            System.out.println("execution completed!");
        }


    }
}
