public class Test3 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(System.nanoTime());
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
        Runtime.getRuntime().gc();
        System.out.println(System.nanoTime());

    }
}
