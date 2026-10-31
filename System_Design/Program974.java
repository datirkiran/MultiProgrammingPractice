class ParkingLot
{
    private static ParkingLot instance;

    private ParkingLot()
    {
        System.out.println("Parkig Lot Objrct Created");
    }

    public static ParkingLot getInstance()
    {
        if(instance == null)
        {
            instance = new ParkingLot();
        }

        return instance;
    }
}

class Program974
{
    public static void main(String A[]) 
    {
        ParkingLot pobj1 = ParkingLot.getInstance();
        ParkingLot pobj2 = ParkingLot.getInstance();
        
        System.out.println(pobj1 == pobj2);
    }
}