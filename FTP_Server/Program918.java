import java.util.*;
import java.net.*;

public class Program918 
{
    public static void main(String A[]) 
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("======================================");
            System.out.println("====== Mrvellous Server Started ======");
            System.out.println("======================================");

            System.out.println("Server is waiting for client request");

            Socket clientsocket = serversocket.accept();

            System.out.println("Client connected sucesfully");

        }
        
        catch(Exception e)
        {
            System.out.println("Client connected occured : "+e);
        }
    }   
}
