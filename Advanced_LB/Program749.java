/////////////////////////////////////////////////////////////////////
//
// Accept the String from user and count name word is how many time
//
// Input:  my name is kiran school name is abhinav city name is pune
// Output: ym eman si narik
/////////////////////////////////////////////////////////////////////

import java.util.*;

class Program749
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();  

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split("");

        int iCount = 0;
        
        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].equals("name"))
            {
                iCount++;
            }
        }
    }
}