import java.io.IOException;

public class UgadatBukvu {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'K';
        do {
            System.out.println("Задумана буква из диапазона A-Z\nПопытайтесь его угадать: ");
            ch = (char) System.in.read();
            do ignore = (char) System.in.read();
            while (ignore != '\n');

            if (ch == answer) System.out.println("Правильно!");
            else {
                System.out.print("Нужная буква находится ");
                if (ch < answer) System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку!\n");
            }
        } while (answer != ch);
    }
}
