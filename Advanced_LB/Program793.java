import java.util.*;
class Matrix
{
    private int Arr [][];
    private int iRow;
    private int iCol;

    public Matrix(int iRow, int iCol)
    {
        Arr = new int [iRow][iCol];
    }

    protected void finalize()
    {
        System.out.println("Inside finalise method");
        Arr = null;
        System.gc();
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

                for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j< iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("element of Matrix are :");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
               System.out.print(Arr[i][j]+"/t");

            }
            System.out.println();
        }
    }
}
class Program793
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;
        int i = 0, j = 0;

        System.out.println("Enter the Number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter the Number of coluns : ");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow, iCol);

        mobj.Accept();
        mobj.Display();

        mobj = null;
        System.gc();

       /*  System.out.println("Enter the element of Matrix");


*/

    }
}