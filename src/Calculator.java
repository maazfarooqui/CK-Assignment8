import java.util.Scanner;

public class Calculator {

    public static void main(String args[])
    {
        operations obj = new operations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select your operation \n " +
                "+ : for addition" +
                "- : for subtraction" +
                "* : for multiplication" +
                "/ : for division");
        char oper = sc.next().charAt(0);
        System.out.println("enter your first operand: ");
        int a = sc.nextInt();
        System.out.println("enter your second operand: ");
        int b = sc.nextInt();

        switch (oper)
        {
            case '+':
                System.out.println(obj.add(a, b));
                break;

            case '-':
                System.out.println(obj.sub(a, b));
                break;

            case '/':
                System.out.println(obj.div(a, b));
                break;

            case '*':
                System.out.println(obj.mul(a, b));
                break;

            default:
                System.out.println("Invalid operator selected");


        }

    }
}

 class operations{

      int add(int a, int b)
     {
         return (a+b);
     }

     int sub(int a, int b)
     {
         return (a-b);
     }

     int mul(int a, int b)
     {
         return (a*b);
     }

    int div(int a, int b)
    {
        return (a/b);
    }
}
