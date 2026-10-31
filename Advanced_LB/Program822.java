// Harshad Number 

import java.io.*;

class Program822
{
    public static void main(String A[]) throws Exception 
    {
        int iNo = 0;
        int iSum = 0;
        int iDigit = 0;
        int iTemp = 0;
        int iRev = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bobj.readLine());

        iTemp = iNo;

        while (iNo != 0) 
        {
            iDigit = iNo % 10;
            iRev = (iRev*10) + iDigit;
            iNo =  iNo / 10;
        }

        if(iRev == iTemp)
        {
            System.out.println("it is Palindrom Number");
        }
        else
        {
            System.out.println("it is Not Palindrom Number"); 
        }

        System.out.println(iRev);
    }
}
