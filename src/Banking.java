import java.util.InputMismatchException;
import java.util.Scanner;

public class Banking {

    float balance;
    long amount;
    String accountNumber;
    static int TotalAccounts;

    Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {

        Banking obj = new Banking();


    }

    Banking()
    {

        Boolean ValidInput = false;
        while(!ValidInput){

            System.out.println("Please Enter your Account 12 digit Account Number: ");
            accountNumber = sc.next();
            try{
                if(accountNumber.matches("\\d{12}")){
                    ValidInput = true;
                    TotalAccounts++;
                    balance = (int)(Math.random() * (50000 - 10000 + 1)) + 10000;

                    System.out.println("Welcome User!");
                    getChoice();
                }

                else throw new InputMismatchException("Invalid Account Number please try again");
            }catch (InputMismatchException e)
            {
                System.out.println(e);
            }
        }




    }

    void getChoice()
    {
        System.out.println("Please enter the type of Transaction you want to perform: \n" +
                "Enter 1 for : Deposit \n" +
                "Enter 2 for : Withdraw \n" +
        "Enter 3 for: Display balance");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                deposit();
                break;

            case 2:
                withdraw();
                break;

            case 3:
                getBalance();
                break;

            default:
                System.out.println("Invalid Input !");
        }
    }

    void deposit()
    {


        System.out.println("please enter amount to deposit: ");
        long amount = sc.nextLong();
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

    void withdraw()
    {


        System.out.println("please enter amount to withdraw: ");
        long amount = sc.nextLong();
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
