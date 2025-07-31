import java.io.*;
import java.net.*;

class ClientHandler extends Thread implements MessageHandler {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private String clientName;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Enter your name:");
            clientName = in.readLine();
            System.out.println(clientName + " has joined.");

            String message;
            while ((message = in.readLine()) != null) {
                String formatted = clientName + ": " + message;
                System.out.println(formatted);
                ChatServer.broadcast(formatted, this);
            }
        } catch (IOException e) {
            System.out.println("Client disconnected.");
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    @Override
    public void handleMessage(String message) {
        sendMessage(message);
    }
}