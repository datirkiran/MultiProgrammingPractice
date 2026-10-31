import java.util.*;
class Matrix
{
    public int Arr [][];

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
}
class Program790
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

        System.out.println("inside constrctor");
        Matrix mobj = new Matrix(iRow, iCol);

       /*  System.out.println("Enter the element of Matrix");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j< iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("element of Matrix are :");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j< iCol; j++)
            {
               System.out.print(Arr[i][j]+"/t");

            }
            System.out.println();
        }*/

    }
}