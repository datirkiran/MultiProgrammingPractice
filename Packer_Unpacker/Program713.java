import java.util.*;

class StringX
{
   int CountWords(String str)
{
      str = str.trim();

      str = str.replaceAll("\\s+", " ");

      String Tokens[] = str.split(" ");
      return Tokens.length;
}
}

class Program713
{
    public static void main(String A[]) 
   {
      StringX strobj = new StringX();
      Scanner sobj = new Scanner(System.in);
      int iRet = 0;

      String str = null;

      System.out.println("Enter the String : ");
      str = sobj.nextLine();

      iRet = strobj.CountWords(str);
      System.out.println("Number of words in String is : "+iRet);
   }
}
