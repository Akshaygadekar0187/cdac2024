import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SimpleServer {

    public static void main(String[] args) throws IOException {
        
        Map<String, Map<String, Integer>> data = new HashMap<>();
        data.put("SetA", Map.of("One", 1, "Two", 2));
        data.put("SetB", Map.of("Three", 3, "Four", 4));
        data.put("SetC", Map.of("Five", 5, "Six", 6));
        data.put("SetD", Map.of("Seven", 7, "Eight", 8));
        data.put("SetE", Map.of("Nine", 9, "Ten", 10));

        ServerSocket server = new ServerSocket(8080);
        System.out.println("Server is ready on port 8080");

        while (true) {
            Socket client = server.accept();
            System.out.println("Client connected");

            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter writer = new PrintWriter(client.getOutputStream(), true);

            String input = reader.readLine();  
            System.out.println("Received: " + input);

            String[] parts = input.split("-");

            if (parts.length == 2 && data.containsKey(parts[0])) {
                Map<String, Integer> subset = data.get(parts[0]);
                Integer count = subset.get(parts[1]);

                if (count != null) {
                    for (int i = 0; i < count; i++) {
                        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
                        writer.println(time);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            writer.println("Error while waiting.");
                        }
                    }
                } else {
                    writer.println("EMPTY");
                }
            } else {
                writer.println("EMPTY");
            }

            client.close();
            System.out.println("Client disconnected\n");
        }
    }
}
