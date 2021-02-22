import java.time.LocalTime;
import java.util.Date;

public class GalToLit {
    public static void main(String[] args) throws InterruptedException {
       double gallons;
       double liters;

       gallons = 25;
       liters = gallons * 3.7854;
        System.out.println(gallons + " галлонам соответствует " + liters + " литра");
    }
}
