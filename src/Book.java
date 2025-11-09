public class Book {

    String author;
    String title;
    float price;
    public static void main(String args[])
    {
        Book obj = new Book();
        System.out.println(obj.author);
        System.out.println(obj.title);
        System.out.println(obj.price);
    }

    Book()
    {
        author = "J.K. Rowling";
        title = "Harry Potter Deathly Hallows Part 1";
        price = 12.5f;
    }
}
