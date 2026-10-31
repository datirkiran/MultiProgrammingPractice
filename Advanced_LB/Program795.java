package Marvellous;

import java.util.*;

class Program795
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

        MatrixLB mobj = new MatrixLB(iRow, iCol);

        mobj.Accept();
        mobj.Display();

        mobj = null;
        System.gc();
    }
}