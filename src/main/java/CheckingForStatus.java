import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;

public class CheckingForStatus {

    public static boolean isAccessable(String url, int timeout) {
        url = url.replaceFirst("https", "http"); // Otherwise an exception may
        // be thrown on invalid SSL
        // certificates.

        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setConnectTimeout(timeout);
            connection.setReadTimeout(timeout);
            connection.setRequestMethod("HEAD");

            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                System.out.println("метод try сработал if");
                return false;
            }
        } catch (IOException exception) {
            System.out.println("метод catch сработал");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAccessable("https://www.youtube.com/watch?v=zFTgwl4Y45x", 0));
    }

}
