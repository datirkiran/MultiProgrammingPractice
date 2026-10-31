import java.io.*;
import java.net.*;
import java.util.*;

public class Program920
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("======================================");
            System.out.println("====== Mrvellous Client Started ======");
            System.out.println("======================================");

            Socket socket = new Socket(
                                  "127.0.0.1",
                                  9000
                                     );

            System.out.println("Conection with Sever is sucessful");

            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        }
        
        catch(Exception e)
        {
            System.out.println("Client connected occured : "+e);
        }
    }   
}
