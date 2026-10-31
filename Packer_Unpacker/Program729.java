import java.io.*;
import java.util.*;

class Program729 
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String PackedFileName = null;
        File fpackobj = null;
        FileInputStream fiobj = null;
        byte Header[] = new byte[100];
        String strHeader = null;

        System.out.println("Enter the name of packed file : ");
        PackedFileName = sobj.nextLine();

        fpackobj = new File(PackedFileName);

        if((fpackobj.exists()))
        {
            fiobj = new FileInputStream(fpackobj);
            
            fiobj.read(Header, 0, 100);

            strHeader = new String(Header);
            System.out.println("Header is : "+strHeader);
        }
        else
        {
            System.out.println("Packed file is not exists");
        }
    }
    
}
