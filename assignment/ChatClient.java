import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);

        new ReadThread(socket).start();
        new WriteThread(socket).start();
    }
}