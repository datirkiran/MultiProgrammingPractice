import java.io.*;

class Program808
{
    public static void main(String A[]) throws Exception 
    {
        int iNo = 0;
        long iFact = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bobj.readLine());

        iFact = 1;

        while (iNo != 0)
        {
            iFact = iFact * iNo;
            iNo--;
        }
        
        System.out.println("Factorial is : "+iFact);
    } 
}
