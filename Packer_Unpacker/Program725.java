import java.io.*;
import java.util.*;

public class Program725
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        int Size = 0;
        int i = 0, j = 0;

        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        String PackedFileName = null;
        String header = "";

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

        System.out.println("Enter Folder Name : ");
        FolderName = sobj.nextLine();

        System.out.println("Enter the Name of Packed File: ");
        PackedFileName = sobj.nextLine();


        File fobjfolder = new File(FolderName);

        if((fobjfolder.exists()) && (fobjfolder.isDirectory()))
        {
            System.out.println("Folder is exists");

            File fobjpack = new File(PackedFileName);
            fobjpack.createNewFile(); // Packed file gets created
          
            foobj = new FileOutputStream(fobjpack);

            File FArr[] = fobjfolder.listFiles();
            System.out.println("Number of files in folderare : "+FArr.length);
            
            byte Buffer[] = new byte[1024];

            for( i = 0; i < FArr.length; i++)
            {
                fiobj = new FileInputStream(FArr[i]);

                header = header + FArr[i].getName();
                header = header + " ";
                header = header + FArr[i].length();

                System.out.println("Header length : " + header);

                Size = 100 - header.length();

                for( j = 0; j < Size; j++)
                {
                    header = header + " ";
                }

                System.out.println("Header length is : " + header.length());

                // write file name and size

                /*// Loop to read data from fiobj and write into foobj

                while ((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer, 0, iRet);      
                }*/

                fiobj.close();
                header = "";
            }

            foobj.close();
            sobj.close();
            
        }
        else
        {
            System.out.println("Folder is not exists");
        }
    }
}
