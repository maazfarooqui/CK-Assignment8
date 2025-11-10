public class ExceptionPropogation {

    public static void main(String args[])
    {
        ExceptionPropogation obj = new ExceptionPropogation();
        obj.m1();

    }

    void m1()
    {
        try{
            m2(4,0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division y zero thrown by m1");
        }

    }

    void m2(int a, int b)
    {


            m3(a, b);



    }

    void m3(int a, int b) throws ArithmeticException
    {
        if(b==0) throw new ArithmeticException("Denominator is zero thrown by m3");

        System.out.println(a/b);
    }
}
