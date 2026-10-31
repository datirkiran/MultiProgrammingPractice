enum VehicleType
{
    BICK,
    CAR,
    TRUCK
}

abstract class Vehicle 
{
    private String number;

    public Vehicle(String number)
    {
        this.number = number;
    }

    public String getNumber()
    {
        return this.number;
    }

    public abstract void display();
}

class Bike extends Vehicle
{
    public Bike(String number)
    {
        super(number);
    }

    public void display()
    {
        System.out.println("Bike : "+getNumber());
    }
}

class Car extends Vehicle
{
    public Car(String number)
    {
        super(number);
    }

    public void display()
    {
        System.out.println("Car : "+getNumber());
    }
}

class Truck extends Vehicle
{
    public Truck(String number)
    {
        super(number);
    }

    public void display()
    {
        System.out.println("Truck : "+getNumber());
    }
}

class Program977
{
    public static void main(String A[]) 
    {
        Car cobj = new Car("MH12VL0007");

        cobj.display();

        Truck tobj = new Truck("MH12KF0007");

        tobj.display();
    }
}