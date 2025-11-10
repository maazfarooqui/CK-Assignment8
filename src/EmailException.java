import java.util.Scanner;

public class EmailException {
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        EmailException obj = new EmailException();
        obj.getEmail();
    }

    void getEmail()
    {
        try{
            System.out.println("enter your email");
            String email = sc.next();
            if(!email.contains("@") || email == null || !email.contains("."))
            {
                throw new Exception("Invalid Email address!");
            }

            else {
                System.out.println("User has been registered");
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
