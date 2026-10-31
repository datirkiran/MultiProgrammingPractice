import java.io.*;

class Program817
{
    public static void main(String A[]) throws Exception 
    {
        int iNo = 0;
        int iCount = 0;
        int iTemp = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bobj.readLine());

        iTemp = iNo;

        while (iNo != 0) 
        {
            iCount++;
            iNo = iNo / 10;   
        }

        iNo = iTemp;

        int iDigit = 0;
        int iSum = 0;

        while (iNo != 0) 
        {
            iDigit = iNo % 10;
            iSum = iSum + (int)Math.pow(iDigit, iCount);
            iNo = iNo / 10; 
        }

        if(iSum == iTemp)
        {
            System.out.println("It is Amstrong Number");
        }
        else
        {
            System.out.println("It is Amstrong Number");
        }
    } 
}
