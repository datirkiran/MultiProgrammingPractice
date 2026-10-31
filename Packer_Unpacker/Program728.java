/////////////////////////////////////////////////////////
//
// Final Packing Program
//
////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

public class Program728
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

        byte Buffer[] = new byte[1024];
        byte bHeader[] = null;

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

            for( i = 0; i < FArr.length; i++)
            {
                fiobj = new FileInputStream(FArr[i]);

                header = header + FArr[i].getName();
                header = header + " ";
                header = header + FArr[i].length();

                Size = 100 - header.length();

                for( j = 0; j < Size; j++)
                {
                    header = header + " ";
                }

                bHeader = header.getBytes();

                // write file name and size
                foobj.write(bHeader);

                // Loop to read data from fiobj and write into foobj
                while ((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer, 0, iRet);      
                }

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
