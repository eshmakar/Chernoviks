public class Break {
    public static void main(String[] args) {
        done:
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 100; k++) {
                    System.out.println(k);
                    break done;
                }
                System.out.println(j);
            }
            System.out.println(i);
        }
    }
}
/**
 пример как можно использовать оператор break, для прервания процесса
 */