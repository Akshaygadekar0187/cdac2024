import java.io.*;
import java.net.*;

public class SimpleClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            BufferedReader inputFromUser = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.print("Enter something like SetA-Two: ");
            String message = inputFromUser.readLine();
            out.println(message);

            String response;
            while ((response = in.readLine()) != null) {
                System.out.println("Server: " + response);
            }

            socket.close();

        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}

