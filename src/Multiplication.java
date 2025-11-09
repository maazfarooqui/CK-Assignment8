public class Multiplication {

    public static void main(String args[])
    {
        multiply((6));
    }

    static void multiply(int num)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
