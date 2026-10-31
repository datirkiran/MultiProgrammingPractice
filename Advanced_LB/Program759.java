import java.util.*;

class Program759
{
    public static boolean CheckAnagam(String str1, String str2)
    {
        int i = 0;

        if(str1.length() != str2.length())
        {
            return false;
        }

        str1 = str1.trim();
        str1 = str1.replaceAll("\\s+", " ");
        str1 = str1.toLowerCase();
        char Arr[] = str1.toCharArray();
        int Frequncy1[] = new int[26];

        str2 = str2.trim();
        str2 = str2.replaceAll("\\s+", " ");
        str2 = str2.toLowerCase();
        char Brr[] = str2.toCharArray();
        int Frequncy2[] = new int[26];

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequncy1[(int)Arr[i]- 97]++;
            }

            if(Brr[i] >= 'a' && Brr[i] <= 'z')
            {
                Frequncy2[(int)Brr[i]- 97]++;
            }

        }

        boolean bFlag = true;

        for(i = 0; i < Frequncy1.length; i++)
        {
            if(Frequncy1[i] != Frequncy2[i])
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;
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