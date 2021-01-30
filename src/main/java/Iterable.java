import java.util.*;

public class Iterable {
    public static void main(String[] args) {
        /** {
         HashSet<Integer> sett = new HashSet<>();
         for (int i = 0; i<50; i++)
         sett.add(new Random().nextInt(50));

         *//* HashSet
USA
Japan
Egypt
Mexico
Russia
        *//*

         *//*TreeSet
Egypt
Japan
Mexico
Russia
USA
        *//*
        for (int s: sett)
            System.out.println(s);
    }*/
        /*HashMap<Double, Double> maps = new HashMap<>();
        for (int i = 0; i < 2_000_000_000; i++) {
            maps.put(new Random().nextDouble(), new Random().nextDouble());
        }

        System.out.println("Размер: " + maps.size());*/
//
//   for (Map.Entry entry: maps.entrySet()) {
//       System.out.print(entry.getKey() + " - ");
//       System.out.println(entry.getValue());
        /*int count = 0;
        TreeMap<String, Integer> t = new TreeMap<>();
        for (int i = 0; i < 10_000; i++) {
        t.put(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS")), count++);
        }
        System.out.println(t);*/

     Map<Animal, String> enumMap = new EnumMap<Animal, String>(Animal.class);
     enumMap.put(Animal.Cat, "C");
     enumMap.put(Animal.Bird, "B");
     enumMap.put(Animal.Dog, "D");

        Set set = enumMap.entrySet();







    }

    enum Animal {
        Cat, Dog, Bird
    }
}