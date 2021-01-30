import java.util.Random;

public class RandText {

    public static void main(String[] args) {

        int leftLimit = 45; // symbol '-'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 11; //кол-во букв в сайте
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);

        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            if (randomLimitedInt == '/' || randomLimitedInt == '.' || randomLimitedInt == '@' || randomLimitedInt == '?' || randomLimitedInt == '=' || randomLimitedInt == '>' || randomLimitedInt == '<' || randomLimitedInt == ';' || randomLimitedInt == ':' || randomLimitedInt == '[' || randomLimitedInt == ']' || randomLimitedInt == '^' || randomLimitedInt == '`' || randomLimitedInt == '\\')
                continue;
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        String site = "https://www.youtube.com/watch?v=" + generatedString; //переобразует в ссылку
        String blank = "_blank";


    }


}