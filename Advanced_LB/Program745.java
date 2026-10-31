/////////////////////////////////////////////////////////////////////
//
// Accept the String from user and Reverse it using inbuilt fumction
//
// Input:  my name is kiran
// Output: ym eman si narik
/////////////////////////////////////////////////////////////////////

import java.util.*;

class Program745
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();  

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split("");

        StringBuffer sb = null;

        for(int i =  0; i < Tokens.length; i++)
        {
            sb = new StringBuffer(Tokens[i]);
            System.out.println(sb.reverse());
        }


    }
}