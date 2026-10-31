import java.util.*;

class Program783
{
    public static void main(String A[]) 
    {
        HashMap <String, Integer>hobj = new HashMap<String, Integer>();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        int iCount = 0;

        for(String s : Tokens)
        {
            if(hobj.containsKey(s))
            {
                iCount = hobj.get(s);
                hobj.put(s, hobj.get(s)+1);

            }
            else
            {
                hobj.put(s, 1);   
            }
        }  
        
        int iMax = 0;
        String temp = null;

        for(String sValue : hobj.keySet())
        {
            if(hobj.get(sValue) > iMax)
                {
                    iMax = hobj.get(sValue);

                }    
     
        }

        System.out.println("Occ");
    }
}