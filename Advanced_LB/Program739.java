import java.util.*;

class Program739
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();  

        str = str.trim(); 

        str = str.replaceAll("\\s+", " "); 

        String Tokens[] = str.split(" "); 

        System.out.println("Number of words in the string are : "+Tokens.length);

        String temp = null;
        temp = Tokens[0];

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].length() >temp.length())
            {
                temp = Tokens[i];   
            }
        } 
        
        System.out.println("Largest length word in the string is : "+temp+" and its length is : "+temp.length());
    }
}