import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class UrlTest {

    public static void main (String[] args) {
        InputStream response = null;
        try {
            String url = "https://bit.ly/2xCsjqp";
            response = new URL(url).openStream();


            Scanner scanner = new Scanner(response);
            String responseBody = scanner.useDelimiter("\\A").next();

            String titleFromSite = responseBody.substring(responseBody.indexOf("<title>") + 7, responseBody.indexOf("</title>"));
//            if (titleFromSite.equals(" - YouTube"))
//                System.out.println("не работает");
//            else System.out.println(url + " - " + titleFromSite);
            System.out.println(url + " - " + titleFromSite);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}


