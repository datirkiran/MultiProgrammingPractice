class ArrayX
{
    public int Arr[];
    public int iSize;
    public ArrayX(int iSize)
    {
        this.iSize = iSize;
        Arr  = new int [iSize];
    }
     public void Accept()
        {
            Scanner sobj = new Scanner(System.in);
            System.out.println("Enter the element in array");

            for(int i = 0; i < this.iSize; i++)
            {
                System.out.println(Arr[i]);
            }

        }
         public void Display()
        {
            System.out.println("Enter the element in array");

            for(int i = 0; i < this.iSize; i++)
            {
                System.out.println(Arr[i]);
            }

        }    
}
class Program869 
{
    public static void main(String A[]) 
    {  
        ArrayX aobj = new ArrayX(5); 
        
        aobj.Accept();
        aobj.Display();
    }
}
