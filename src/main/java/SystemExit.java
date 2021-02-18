import java.util.Scanner;

public class SystemExit {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the message or exit to exit");
            String s = scanner.nextLine();
            if (s.toLowerCase().equals("exit")) {
                System.out.println("You exiting from the program");
                System.exit(0);
            }
        }
    }
}
