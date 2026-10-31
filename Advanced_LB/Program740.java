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

class Program740
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();  

        str = str.trim(); 

        str = str.replaceAll("\\s+", " "); 

        str = str.toLowerCase();

        System.out.println(str);

    }
}