import java.util.Scanner;

public class Banking {

    static float balance;
    long Amount;

    Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {

        Banking obj = new Banking();
        balance = 50000;
        obj.deposit(6000);
        obj.withdraw(200000);

    }

    void deposit(int amount)
    {


        try{
            if(amount<0)
            {
                throw new Exception("Error: Deposit can't be less than 0");
            }
           balance += amount;
            System.out.println("Deposit Succesfull! Balance is: " + balance);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    void withdraw(int amount)
    {
            try{

                if(balance<amount)
                {
                    throw new Exception("Error: Insuffiecient Funds");
                }
                balance -= amount;
                System.out.println("Withdraw succesfull! Balance is: "+ balance);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
    }


    void getBalance()
    {
        System.out.println(balance);
    }
}
