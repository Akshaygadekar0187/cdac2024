public class EncryptionUtils {
    private static final int SHIFT = 3;

    public static String encrypt(String msg) {
        StringBuilder result = new StringBuilder();
        for (char ch : msg.toCharArray()) {
            result.append((char)(ch + SHIFT));
        }
        return result.toString();
    }

    public static String decrypt(String msg) {
        StringBuilder result = new StringBuilder();
        for (char ch : msg.toCharArray()) {
            result.append((char)(ch - SHIFT));
        }
        return result.toString();
    }
}
