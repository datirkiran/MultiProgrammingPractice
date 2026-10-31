/////////////////////////////////////////////////////////////////////
//
// Accept the String from user and Reverse it using inbuilt fumction
//
// Input:  my name is kiran
// Output: ym eman si narik
/////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public String WordReverse(String str)
    {
        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split("");

        StringBuffer sb = null;
        StringBuffer FinalStr = null;

        for(int i =  0; i < Tokens.length; i++)
        {
            sb = new StringBuffer(Tokens[i]);
            sb = sb.reverse();
            FinalStr = FinalStr.append(sb);
            FinalStr = FinalStr.append(" ");

            String Output = new String(FinalStr);
            Output = Output.trim();

            System.out.println(Output);
        }

        return str;
    }
}

class Program748
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine(); 
        
        StringX strobj = new StringX();

        String sRet = strobj.WordReverse(str);

        System.out.println(sRet);

        
    }
}