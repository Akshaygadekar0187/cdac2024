import java.io.*;
import java.net.*;

class WriteThread extends Thread {
    private PrintWriter writer;
    private BufferedReader consoleInput;

    public WriteThread(Socket socket) {
        try {
            writer = new PrintWriter(socket.getOutputStream(), true);
            consoleInput = new BufferedReader(new InputStreamReader(System.in));
        } catch (IOException e) {
            System.out.println("Error setting up write thread");
        }
    }

    public void run() {
        try {
            String input;
            while ((input = consoleInput.readLine()) != null) {
                writer.println(input);
            }
        } catch (IOException e) {
            System.out.println("Error sending message");
        }
    }
}