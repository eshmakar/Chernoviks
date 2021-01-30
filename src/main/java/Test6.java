public class Test6 {

    public static void main(String[] args) {
        for (char c = '-'; c <= 'z'; c++) {
            if (al(c)) continue;
            System.out.print(c);
        }
    }

    private static boolean al(char c) {
        if (c == '/' || c == '.' || c == '@' || c == '?' || c == '=' || c == '>' || c == '<' || c == ';' || c == ':' || c == '[' || c == ']' || c == '^' || c == '`' || c == '\\')
            return true;
        return false;
    }



}
