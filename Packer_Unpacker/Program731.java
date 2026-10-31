import java.io.*;
import java.util.*;

class Program731
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String PackedFileName = null;
        File fpackobj = null;
        FileInputStream fiobj = null;
        byte Header[] = new byte[100];
        String strHeader = null;
        String Tokens[] = null;
        File NewFile = null;

        System.out.println("Enter the name of packed file : ");
        PackedFileName = sobj.nextLine();

        fpackobj = new File(PackedFileName);

        if((fpackobj.exists()))
        {
            fiobj = new FileInputStream(fpackobj);
            
            fiobj.read(Header, 0, 100);

            strHeader = new String(Header);
            System.out.println("Header is : "+strHeader);

            strHeader = strHeader.trim();
            strHeader = strHeader.replaceAll("\\s+", " ");

            Tokens = strHeader.split(" ");

            System.out.println("File name is : "+Tokens[0]);
            System.out.println("File size is : "+Tokens[1]);

            NewFile = new File(Tokens[0]);
            NewFile.createNewFile();
        }
        else
        {
            System.out.println("Packed file is not exists");
        }
    }
    
}
