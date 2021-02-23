import java.math.BigDecimal;

public class ConvertBooleanToByteZeroOrOne {
    public static void main(String[] args) throws InterruptedException {
        boolean b = true;
        boolean b2 = false;

        System.out.println((byte) (b ? 1 : 0));
        System.out.println((byte) (b2 ? 1 : 0));


    }
}
