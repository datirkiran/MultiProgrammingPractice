/////////////////////////////////////////////////////////////////////
//
// Accept the String from user and count name word is how many time
//
// Input: india is My country and i love india 
// Output: bharat is My country and i love bharat
/////////////////////////////////////////////////////////////////////

import java.util.*;

class Program751
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

        StringBuffer FinalStr = new StringBuffer("");

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].equals("india"))
            {
                FinalStr = FinalStr.append("bharat");
                FinalStr = FinalStr.append(" ");

                continue;
            }

            FinalStr = FinalStr.append(Tokens[i]);

            FinalStr = FinalStr.append(" ");
        }

        String output = new String(FinalStr);

        output = output.trim();

        System.out.println(output);
    }
}