import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Test {
   public static void main(String[] args) throws IOException {
        System.setErr(new PrintStream(new File("log.txt")));
       for (int i = 0; i < 16; i++) {
           System.err.println("message " +i);
       }

        try {
            throw new Exception("Message of error");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

