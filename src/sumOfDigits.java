public class sumOfDigits {

    public static void main(String args[])
    {
        int result = sum(1234);
        System.out.println(result);
    }

    static int sum(int num)
    {
        int total=0;
        while(num>0)
        {
            int digit = num % 10;
            total += digit;
            num = num/10;
        }

        return total;
    }
}
