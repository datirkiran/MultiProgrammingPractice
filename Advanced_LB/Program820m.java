// Harshad Number 

import java.io.*;

class Program820m
{
    public static void main(String A[]) throws Exception 
    {
        int iNo = 0;
        int iSum = 0;
        int iDigit = 0;
        int iTemp = 0;
        int i = 0;

        int iStart = 0, iEnd = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Starting point : ");
        iStart = Integer.parseInt(bobj.readLine());

        System.out.println("Enter Ending point : ");
        iEnd = Integer.parseInt(bobj.readLine());

        System.out.println("Harshad Numbers Are : ");
        for(i = iStart; i <= iEnd; i++)
        {
           iNo = i;

           while (iNo != 0) 
           {
              iDigit = iNo % 10;
              iSum = iSum + iDigit;
              iNo =iNo / 10;  
           }
        }
        if(i  % iSum == 0)
        {
            System.out.println(i);    
        }
      
        iSum = 0;
    }
}
