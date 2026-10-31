import java.io.*;
import java.util.*;
import java.net.*;

public class Program919
{
    public static void main(String A[]) 
    {
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
        }
        
        catch(Exception e)
        {
            System.out.println("Client connected occured : "+e);
        }
    }   
}
