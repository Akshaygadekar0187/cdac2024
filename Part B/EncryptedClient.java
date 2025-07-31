import java.io.*;
import java.net.*;

public class EncryptedClient {
    public static void main(String[] args) {
        try (
            Socket socket = new Socket("localhost", 8080);
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            System.out.print("Enter message (e.g. SetA-Two): ");
            String message = input.readLine();
            out.println(EncryptionUtils.encrypt(message));

            String response;
            while ((response = in.readLine()) != null) {
                System.out.println("Server: " + EncryptionUtils.decrypt(response));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
