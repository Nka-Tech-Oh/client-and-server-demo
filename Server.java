import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException{
        // Step 1: Create a ServerSocket object to listen for incoming client connections on port 4999
        ServerSocket ss = new ServerSocket(4999);

        // Step 2: Accept incoming client connection requests and create a Socket object to communicate with the client
        Socket s = ss.accept();

        // Step 3: Print a message indicating that a client has successfully connected
        System.out.println("Client connected");

        // Step 4: Create an InputStreamReader to read data sent by the client over the socket
        InputStreamReader in = new InputStreamReader(s.getInputStream());

        // Step 5: Create a BufferedReader to read the data from the InputStreamReader efficiently
        BufferedReader bf = new BufferedReader(in);

        // Step 6: Read the data sent by the client, line by line
        String str = bf.readLine();

        // Step 7: Print the data received from the client
        System.out.println("Client:"+ str);

        // Step 8: Close the BufferedReader, InputStreamReader, and Socket
        bf.close();
        in.close();
        s.close();

        // Step 9: Close the ServerSocket to stop listening for incoming connections
        ss.close();
    }
}
