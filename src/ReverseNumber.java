import static java.lang.Math.pow;

public class ReverseNumber {

    public static void main(String args[])
    {
        reverse((6321));
    }

    static void reverse(int num)
    {

        int revNum =0;
        String len = String.valueOf(num);
        int length = len.length();
        int tens = (int) pow(10, length-1);
        while(num>0)
        {
            int digit = num%10;
            digit = digit *tens;
            tens = tens/10;
            revNum += digit;
            num = num/10;

        }
        System.out.println(revNum);
    }
}

