import java.util.*;

class Program789
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

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter the element of Matrix");

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
        }

    }
}