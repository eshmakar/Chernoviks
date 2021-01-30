public class StringSearch {
    public static void main(String[] args) {
        String s = "Hellome";
        s = s.replaceAll("l", "").replaceAll("m", "");
        System.out.println(s.substring(0, 2));
    }
}
