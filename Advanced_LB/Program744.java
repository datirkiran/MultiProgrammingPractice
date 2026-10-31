/////////////////////////////////////////////////////////////////////
// Accept the String from user and Reverse it using inbuilt fumction
/////////////////////////////////////////////////////////////////////

import java.util.*;

class Program744
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();  

        StringBuffer sb = new StringBuffer(str);
        
        System.out.println(sb.reverse());

    }
}