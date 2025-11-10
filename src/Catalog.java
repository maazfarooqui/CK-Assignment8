import java.util.ArrayList;
import java.util.Scanner;


class InvalidPriceException extends Exception {
    InvalidPriceException(String message) {
        super(message);
    }
}

public class Catalog {

    Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();


        for(int i=0; i<3; i++)
        {


        System.out.println("Enter id of the product:");
        int id = sc.nextInt();
        System.out.println("Enter name of Product: ");
        String name = sc.next();
        System.out.println("Enter price of product: ");
        float price = sc.nextFloat();



       try{
           Product obj = new Product(name, id, price);
           products.add(obj);

       }catch (InvalidPriceException e)
       {
           System.out.println(e);
       }


        }

        for(Product p : products)
        {
            System.out.println(p);
        }
    }
}

class Product{

    private String name;
    private int id;
    private float price;

    Product(String name, int id, float price) throws InvalidPriceException
    {
        if(price<0)
        {
            throw new InvalidPriceException("Error: Price is less than 0!!");
        }
        this.name = name;
        this.id = id;
        this.price = price;
    }

    String getName() {return name;}
    int getId() {return id;}
    float getPrice() {return price;}


    public String toString()
    {
        return "Product name: " + name + " Product id: " + id + " Price: "+ price;
    }

}
