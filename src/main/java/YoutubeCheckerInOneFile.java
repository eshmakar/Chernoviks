import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class YoutubeCheckerInOneFile {

    static long count = 0;

    public static void randd() {
        int leftLimit = 45; // symbol '-'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 28; //кол-во букв в сайте
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);

        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
//            if (randomLimitedInt == '/' || randomLimitedInt == '.' || randomLimitedInt == '@' || randomLimitedInt == '?' || randomLimitedInt == '=' || randomLimitedInt == '>' || randomLimitedInt == '<' || randomLimitedInt == ';' || randomLimitedInt == ':' || randomLimitedInt == '[' || randomLimitedInt == ']' || randomLimitedInt == '^' || randomLimitedInt == '`' || randomLimitedInt == '\\')
//                continue;
            buffer.append((char) randomLimitedInt);
        }


        String generatedString = buffer.toString();
        generatedString = generatedString.replace("\\", "").replace("[", "").replace("^", "").replace("?", "").replace("/", "").replace(".", "").replace("@", "").replace("=", "").replace(">", "").replace("<", "").replace(";", "").replace(":", "").replace("]", "").replace("`", "");
        String url = "https://www.youtube.com/watch?v=" + generatedString.substring(0, 11); //переобразует в ссылку
        String blank = "_blank";

        char dm = (char) 34; // символ двойные кавычки, чтобы составить html тег


        InputStream response = null;
        try {
            response = new URL(url).openStream();


            Scanner scanner = new Scanner(response);
            String responseBody = scanner.useDelimiter("\\A").next();

            String titleFromSite = responseBody.substring(responseBody.indexOf("<title>") + 7, responseBody.indexOf("</title>"));
            if (!titleFromSite.equals(" - YouTube")) {
                System.out.println(url + " - " + titleFromSite + " попытка №: " + count);
            }

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

    public static void main(String[] args) {
        System.out.println("Работу начал...");
        for (int i = 0; i < 100_000; i++) {
            randd();
            count++;
        }
        System.out.println("completed");
    }
}
