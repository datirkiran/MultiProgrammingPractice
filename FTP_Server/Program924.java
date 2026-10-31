import java.io.*;
import java.net.*;
import  java.security.cert.TrustAnchor;

public class Program924
{
    public static void main(String A[]) 
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("======================================");
            System.out.println("====== Mrvellous Server Started ======");
            System.out.println("======================================");

            // Loop for multiple client requests
            while(true) 
            {
                System.out.println("Server is waiting for client request");

                Socket clientsocket = serversocket.accept();

                System.out.println("Client connected sucesfully");

               // Thread gets created for client
               Thread t = new Thread(() -> HandleClientRequest(clientsocket));

               t.start();
            } // End Of While
        }
        
        catch(Exception e)
        {
            System.out.println("Client connected occured : "+e);
        }
    }  // End of Main
    
    public static void HandleClientRequest(Socket socket)
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to Marvellous Server");

            while (true) 
            {
                String command = dis.readUTF();

                System.out.println("Command received from client : "+command);

                String parts[] = command.split(" ");

                String optation = parts[0].toUpperCase();

                if(optation.equals("QUIT"))
                {
                    dos.writeUTF("Disconneced from server");
                    break;
                }
                if(parts.length != 3)
                {
                    dos.writeUTF("Invalid command format");
                    continue;   
                }

                double no1 = Double.parseDouble(parts[1]);
                double no2 = Double.parseDouble(parts[2]);

                double result = 0.0;

                if(optation.equals("ADD"))
                {
                    result = no1 + no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if (optation.equals("SUB"))
                {
                    result = no1 - no2;

                    dos.writeUTF("result is : "+result);     
                }
                else
                {
                    dos.writeUTF("Invalid opration");
                }
            } // End of While

            socket.close();

            System.out.println("Client disconnected");
        }
        catch(Exception e)
        {
            System.out.println("Client connected occured : "+e);   
        }
    }
} // End of Class
