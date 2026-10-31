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

class Program742
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
            if(Arr[i] == 32)
            {
                if (Arr[i+1] >= 'a' && Arr[i+1] <= 'z' ) 
                {
                    Arr[i+1] = (char)(Arr[i + 1] - 32);

                }
            }
        }
        String output = new String(Arr);

        System.out.println("Updated String is : "+output);
    }
}