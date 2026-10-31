/////////////////////////////////////////////////////////////////////////////
// Take input string from user and count the number of words in the string.
//  and display the length of each word in the string.
// highest length word in the string.
// if in String same length of word and we have last word
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program737
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();  

        str = str.trim(); // Remove leading and trailing spaces

        str = str.replaceAll("\\s+", " "); // Replace multiple spaces with a single space

        String Tokens[] = str.split(" "); // Split the string into words based on space

        System.out.println("Number of words in the string are : "+Tokens.length);

        int iMax = 0;
        String temp = null;

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].length() >= iMax)
            {
                iMax = Tokens[i].length();
                temp = Tokens[i];
            }
        }   

        System.out.println("Largest length word in the string is : "+temp+" and its length is : "+iMax);
    }
}