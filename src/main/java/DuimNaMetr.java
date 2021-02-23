public class DuimNaMetr {
    public static void main(String[] args) {
        double dyim, metrs;
        int counter = 0;

        for (dyim = 1; dyim <=12; dyim++) {
            metrs = dyim * 39.37;
            System.out.println(dyim + " дюймам соответствует " + metrs + " метров");
            counter++;
            if (counter==12){
                System.out.println();
                counter=0;
            }
        }
    }
}

/**
 1 дюйм = 2,54 см
 1 фут = 12 дюймов = 0,3048 метра
* */