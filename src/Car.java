public class Car {

    String modelname;
    Float price;
    public static void main(String args[])
    {
        Car obj = new Car("Creta");
        Car obj2 =new Car("Civic", 65000.5f);

        System.out.println("Car 1 name is : " + obj.modelname);
        System.out.println("Car 2 name is: " +obj2.modelname + "\nCar 2 price is : " + obj2.price);

    }

    Car(String modelname)
    {
        this.modelname = modelname;
    }

    Car(String modelname, float price)
    {
        this.modelname = modelname;
        this.price = price;
    }



}
