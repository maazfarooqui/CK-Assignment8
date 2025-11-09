import java.util.Scanner;

public class Student {

    public static void main(String args[])
    {

        Marks s1 = new Marks();
        s1.setMarks(47, 87, 65);
        s1.setName("maaz");

        s1.total();
        s1.Avg();
        s1.getDetails();
    }
}

class Marks extends Student{

    int sub1, sub2, sub3;
    String name;
     void setMarks(int sub1, int sub2, int sub3)
    {
     this.sub1 = sub1;
     this.sub2 = sub2;
     this.sub3 = sub3;
    }

    void setName(String name)
    {
         this.name =name;
    }

    void total()
    {
        System.out.println("Your total Marks is : " + (sub1+sub2+sub3));
    }
    void Avg()
    {
        System.out.println("Your total Marks is : " + ((sub1+sub2+sub3)/3));
    }

    void getDetails()
    {
        System.out.println("Your name is: " + name);
        System.out.println("your marks in " +
                " sub1: " + sub1 +
                " sub2: "+  sub2+
                " sub3: " +sub3);
    }
}
