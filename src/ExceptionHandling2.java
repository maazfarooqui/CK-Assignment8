public class ExceptionHandling2 {


    public static void main(String args[])
    {
        ExceptionHandling2 obj = new ExceptionHandling2();
        obj.m1();

    }

    void m1()
    {
        try{
            m2(4,0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e+ " Division y zero thrown by m1");
        }

    }

    void m2(int a, int b)throws ArithmeticException
    {

        try{

        m3(a, b);

        }catch(ArithmeticException e)
        {
            System.out.println("Exception caught in m2");
            throw new ArithmeticException("Error passed from m2 ");
        }



    }

    void m3(int a, int b) throws ArithmeticException
    {
        if(b==0) throw new ArithmeticException("Denominator is zero thrown by m3");

        System.out.println(a/b);
    }
}
