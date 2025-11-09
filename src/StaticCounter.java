public class StaticCounter {

    static int count=0;
    public static void main(String[] args)
    {
        StaticCounter obj = new StaticCounter();

        StaticCounter obj2 = new StaticCounter();
        StaticCounter obj3 = new StaticCounter();
        StaticCounter obj4 = new StaticCounter();


        System.out.println("the current count is : " + count);
        System.out.println("Object has beeen created a total of : " + count + " times");

    }

    StaticCounter()
    {
        count++;
    }
}
