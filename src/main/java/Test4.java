import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test4 {
    private static final Logger l = Logger.getLogger(Test4.class.getName());

    public static void main(String[] args) throws IOException {

        ConsoleHandler f = new ConsoleHandler();
       // l.setUseParentHandlers(false);
       // l.addHandler(f);
        //l.info("message");

        char[] c = {'c', 'o', 'd'};
       // System.out.println(new String(c));
        System.out.println(c);
    }
}
