import java.util.*;

class Program753
{
    public static void main (String A[])
    {
        int i = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();  

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        char Arr[] = str.toCharArray();

        int Frequncy[] = new int[26];

        // a  b  c  d
        // 97 98 99 100
        // 0  1  2  3
        
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequncy[(int)Arr[i]- 97]++;
            }
        }

        System.out.println("Frequency of each letter is : ");

        for(i = 0; i< Frequncy.length; i++)
        {
            System.out.println((char)(i+97)+":"+(Frequncy[i]));       
        }

    }
}