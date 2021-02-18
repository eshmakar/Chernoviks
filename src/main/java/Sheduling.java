import java.text.SimpleDateFormat;
import java.util.Date;

public class Sheduling {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SSS");

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            System.out.println(dateFormat.format(new Date()));
            Thread.sleep(1);
        }
    }
}
