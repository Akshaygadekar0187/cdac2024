import java.io.*;
import java.net.*;

class ReadThread extends Thread {
    private BufferedReader reader;

    public ReadThread(Socket socket) {
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            System.out.println("Error setting up reader thread");
        }
    }

    public void run() {
        try {
            String response;
            while ((response = reader.readLine()) != null) {
                System.out.println(response);
            }
        } catch (IOException e) {
            System.out.println("Connection closed.");
        }
    }
}