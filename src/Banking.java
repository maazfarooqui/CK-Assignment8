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
        Scanner mainSc = new Scanner(System.in);

        boolean addUser = true;

        while(addUser)
        {
        Banking obj = new Banking();

        Boolean exit = false;
            while(!exit)
            {
                System.out.println("Do you want to see try for another User? Y/N");

                String ans = mainSc.next();
                switch (ans)
                {
                    case "No":
                    case "no":
                    case "n":
                    case "N":
                        addUser = false;
                        exit = true;
                        System.out.println("exiting program! ");
                        System.out.println("Total users created : " + TotalAccounts);
                        break;

                    case "Yes":
                    case "yes":
                    case "y":
                    case "Y":
                        exit = true;
                        break;

                    default:

                }
            }

        }



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
        boolean continueOper = true;
      while(continueOper)
      {
          System.out.println("Please enter the type of Transaction you want to perform: \n" +
                  "Enter 1 for : Deposit \n" +
                  "Enter 2 for : Withdraw \n" +
                  "Enter 3 for: Display balance \n"+
                  "Enter 4: to Exit");
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
              case 4:
                  System.out.println("Thank you for using our service");
                  continueOper = false;
                  break;

              default:
                  System.out.println("Invalid Input !");
          }
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
