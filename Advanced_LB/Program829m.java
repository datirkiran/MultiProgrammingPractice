// Automorphic Number 

import java.io.*;

class Program829m
{
    public static void main(String A[]) throws Exception 
    {
        int iNo = 0;
        int iTemp = 0;
        int iSquare = 0;
        int iCount = 0;
        int iDen = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bobj.readLine());

        while (iNo != 0) 
        {
            if(iNo % 10 != iSquare % 10)
            {
                break;
            } 
            else
            {
                iNo = iNo / 10;
                iSquare = iSquare / 10;  
            }
        }

        if(iNo == 0)
        {
            System.out.println("It is Automorphic Number");
        }
        else
        {
           System.out.println("It is not Automorphic Number");  
        }
    }
}
