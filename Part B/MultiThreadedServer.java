import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MultiThreadedServer {
    private static final int PORT = 8080;


    private static final Map<String, Map<String, Integer>> data = Map.of(
        "SetA", Map.of("One", 1, "Two", 2),
        "SetB", Map.of("Three", 3, "Four", 4),
        "SetC", Map.of("Five", 5, "Six", 6),
        "SetD", Map.of("Seven", 7, "Eight", 8),
        "SetE", Map.of("Nine", 9, "Ten", 10)
    );

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server is running on port " + PORT);

        while (true) {
            Socket client = serverSocket.accept();
            new Thread(() -> handleClient(client)).start(); 
        }
    }

    private static void handleClient(Socket socket) {
        try (
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)
        ) {
            String encryptedInput = reader.readLine();
            String input = EncryptionUtils.decrypt(encryptedInput);
            System.out.println("Received: " + input);

            String[] parts = input.split("-"); 
            String response;

            if (parts.length == 2 && data.containsKey(parts[0])) {
                Map<String, Integer> subset = data.get(parts[0]);
                Integer count = subset.get(parts[1]);

                if (count != null) {
                    for (int i = 0; i < count; i++) {
                        String time = LocalDateTime.now()
                            .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")); 
                        writer.println(EncryptionUtils.encrypt(time));
                        Thread.sleep(1000);
                    }
                    return;
                }
            }

            writer.println(EncryptionUtils.encrypt("EMPTY"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
