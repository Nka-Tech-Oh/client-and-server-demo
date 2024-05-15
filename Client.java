import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException{
        // Step 1: Creating a socket object to establish a connection with the server
        Socket s = new Socket("localhost", 4999);

        // Step 2: Creating a PrintWriter object to send data to the server over the socket
        PrintWriter pr = new PrintWriter(s.getOutputStream());

        // Step 3: Sending a message to the server
        pr.println("Hello Server");

        // Step 4: Flush the PrintWriter to ensure the message is sent immediately
        pr.flush();

        // Step 5: Close the PrintWriter and the socket
        pr.close();
        s.close();
    }
}
