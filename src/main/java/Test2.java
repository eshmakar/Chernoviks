import java.math.BigInteger;

public class Test2 {
    private static int numberPow = 1;

    public static void main(String[] args) {
        for (long i = 0L; i < 123456789L; i++) {
            long t = System.currentTimeMillis();
            numberPow++;
            if (numberPow == 1 || numberPow == 12 || numberPow == 123 || numberPow == 1234 || numberPow == 12345 || numberPow == 123456 || numberPow == 1234567 || numberPow == 12345678) {
                BigInteger b = new BigInteger(String.valueOf(numberPow));
                System.out.print(numberPow + " ^ " + numberPow + " = ");
                System.out.println(b.pow(numberPow).toString().length() + " _______ Выполнено за: " + (double) (System.currentTimeMillis() - t) / 1000 + " секунд, или за " + (double) (System.currentTimeMillis() - t) / 1000 / 60 + " минут");
            }
        }
    }
}