import java.io.*;

class Program816
{
    public static void main(String A[]) throws Exception 
    {
        int iNo = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bobj.readLine());

        String str = String.valueOf(iNo);

       System.out.println("Number of DIgit are : "+str.length()); 

    } 
}
