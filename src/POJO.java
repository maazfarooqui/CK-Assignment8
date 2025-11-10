import java.util.ArrayList;

public class POJO {

    public static void main(String args[])
    {
        Customer c1 = new Customer("maaz", "maaz@gmail.com", 2121);
        Customer c2 = new Customer("john", "johm@gmail.com", 4371);
        Customer c3 = new Customer("ahmad", "ahmad@gmail.com", 5522);


        ArrayList <Customer> customer = new ArrayList<Customer>();

        customer.add(c1);
        customer.add(c2);
        customer.add(c3);

        System.out.println("List of CUstomers: \n");
        for(Customer c : customer)
        {
            System.out.println(c);
        }
    }
}


class Customer{

    private String name;
    private String email;
    private int id;

    Customer(String name, String email, int id)
    {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getName() {return name;}
    public String getEmail() {return email;}
    public int getId() {return id;}


    public String toString() {
        return "Customer ID: " + id + ", Name: " + name + ", Email: " + email;
    }



}
