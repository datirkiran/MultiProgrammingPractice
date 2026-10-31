////////////////////////////////////////////////////////////////
// accept string from user and convert it into Camel case.
//
// Input : my name is kiran
// Output : My Name Is Kiran
//
// Input : my NAME is kIran
// Output : My Name Is Kiran
////////////////////////////////////////////////////////////////
import java.util.*;

class Program741
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();  

        str = str.trim(); // Remove leading and trailing spaces

        str = str.replaceAll("\\s+", " "); // Replace multiple spaces with a single space

        str = str.toLowerCase();
        
        char Arr[] = str.toCharArray(); 

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }

        

    }
}