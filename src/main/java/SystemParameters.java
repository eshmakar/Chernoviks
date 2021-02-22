import java.util.Calendar;
import java.util.Date;

public class SystemParameters {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        long god = (long) (currentTime/(1000*60*60*24*365.25d));
        System.out.println(2021 - god);
        System.out.println();

        long nanoTime = System.nanoTime();
        System.out.println(nanoTime);
        long god2 = (long)(nanoTime/(1000_000_000*60*60*24*365));
        System.out.println(2021- god2);



//        Date date = new Date();
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        calendar.add(Calendar.WEEK_OF_MONTH, 42-18);
//        System.out.println(calendar.getTime());


//        long startTime = System.nanoTime();
//        System.out.println(startTime);
//        long endTime = System.nanoTime();
//        System.out.println(endTime);
//        System.out.println(endTime-startTime);
//
//        System.out.println("______________________________________");
//        long startTime1 = System.currentTimeMillis();
//        System.out.println(startTime1);
//        long endTime1 = System.currentTimeMillis();
//        System.out.println(endTime1);
//        System.out.println(endTime1-startTime1);
    }
}
