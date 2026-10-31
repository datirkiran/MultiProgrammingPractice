import java.io.*;
import java.util.*;

class Program733
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String PackedFileName = null;
        File fpackobj = null;
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;
        byte Header[] = new byte[100];
        String strHeader = null;
        String Tokens[] = null;
        File NewFile = null;
        byte Buffer[] = null;
        int iRet = 0;

        System.out.println("Enter the name of packed file : ");
        PackedFileName = sobj.nextLine();

        fpackobj = new File(PackedFileName);

        if((fpackobj.exists()))
        {
            fiobj = new FileInputStream(fpackobj);
            
            // Read the header from packed file
            while((iRet = fiobj.read(Header, 0, 100)) != -1)
            {
                strHeader = new String(Header);
                System.out.println("Header is : "+strHeader);
            }// End of while

            strHeader = strHeader.trim();
            strHeader = strHeader.replaceAll("\\s+", " ");

            Tokens = strHeader.split(" ");

            System.out.println("File name is : "+Tokens[0]);
            System.out.println("File size is : "+Tokens[1]);

            NewFile = new File(Tokens[0]);
            NewFile.createNewFile();

            foobj = new FileOutputStream(NewFile);

            Buffer = new byte[Integer.parseInt(Tokens[1])];

            // Read Data from packed file and write it into new file
            fiobj.read(Buffer, 0, Integer.parseInt(Tokens[1]));

            // Write data into new file
            foobj.write(Buffer, 0, Integer.parseInt(Tokens[1]));

        }
        else
        {
            System.out.println("Packed file is not exists");
        }
    }
    
}
