import java.util.*;

class Program756
{
    public static boolean CheckAnagam(String Str1, String Str2)
    {
        return true;
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
            System.out.println("Strings are amagram");
        }
        else
        {
            System.out.println("Strings are not amagram");   
        }

    }
}