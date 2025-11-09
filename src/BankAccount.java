public class BankAccount {

     long Balance;
     long  AccountNum;
     String HolderName;
    public static void main(String args[])
    {
        BankAccount obj = new BankAccount(4500000, 203014157543L,  "Maaz Ahmad");

        System.out.println("Your name is: " + obj.HolderName + "\nYour balance is : " + obj.Balance + "\nyour account NUmber is: " + obj.AccountNum);
    }

    BankAccount(long Balance, long AccoutnNum, String HolderName)
    {
        this.Balance = Balance;
        this.AccountNum = AccoutnNum;
        this.HolderName = HolderName;
    }
}
