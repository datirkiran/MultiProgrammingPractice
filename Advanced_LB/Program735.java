/////////////////////////////////////////////////////////////////////////////
// Take input string from user and count the number of words in the string.
//  and display the length of each word in the string.
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program735
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

        for(int i = 0; i < Tokens.length; i++)
        {
            System.out.println("Length of word "+Tokens[i]+" is : "+Tokens[i].length());
        }   


    }
}