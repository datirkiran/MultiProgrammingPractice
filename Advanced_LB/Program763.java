import java.util.*;

class Program763
{
    public static boolean CheckAnagam(String str1, String str2)
    {
        int i = 0;

        if(str1.length() != str2.length())
        {
            return false;
        }

        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        Arrays.sort(Arr);
        Arrays.sort(Brr);

        str1 = new String(Arr);
        str2 = new String(Brr);

        return(str1.equals(str2));
        
    }
    
    public static void main (String A[])
    {
        int i = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string : ");
        String str1 = sobj.nextLine();  

        System.out.println("Enter Second string : ");
        String str2 = sobj.nextLine();

        boolean bRet = false;

        bRet = CheckAnagam(str1, str2);

        if(bRet == true)
        {
            System.out.println("Strings are Amagram");
        }
        else
        {
            System.out.println("Strings are not Amagram");   
        }

    }
}