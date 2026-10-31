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

class VehicleFactory
{
    public static Vehicle createVehiclr(VehicleType type, String number)
    {
        switch (type)
        {
            case BICK:
                return new Bike(number);

            case CAR:
                return new Car(number);  
                
            case TRUCK:
                return new Truck(number);  
            
            default:
                return null;
        }
    }
}

class Program979
{
    public static void main(String A[]) 
    {
        Vehicle v1 = VehicleFactory.createVehiclr(VehicleType.BICK, "MH12VL0007");
        Vehicle v2 = VehicleFactory.createVehiclr(VehicleType.CAR, "MH12WPZ0007");
        Vehicle v3 = VehicleFactory.createVehiclr(VehicleType.TRUCK, "MH12WTZ0007");

        v1.display();
        v2.display();
        v3.display();
    }
}