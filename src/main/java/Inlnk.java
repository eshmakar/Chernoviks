import java.io.InputStream;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class Inlnk {

    static long count = 0;
    static long actual = 0;

    public static void randd() {
        int leftLimit = 48; // symbol '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5; //кол-во букв в сайте
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);

        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
//            if (randomLimitedInt == '/' || randomLimitedInt == '.' || randomLimitedInt == '@' || randomLimitedInt == '?' || randomLimitedInt == '=' || randomLimitedInt == '>' || randomLimitedInt == '<' || randomLimitedInt == ';' || randomLimitedInt == ':' || randomLimitedInt == '[' || randomLimitedInt == ']' || randomLimitedInt == '^' || randomLimitedInt == '`' || randomLimitedInt == '\\')
//                continue;
            buffer.append((char) randomLimitedInt);
        }


        String generatedString = buffer.toString();
        generatedString = generatedString.replace("_", "").replace("-", "").replace("\\", "").replace("[", "").replace("^", "").replace("?", "").replace("/", "").replace(".", "").replace("@", "").replace("=", "").replace(">", "").replace("<", "").replace(";", "").replace(":", "").replace("]", "").replace("`", "");
        String url = "https://inlnk.ru/" + generatedString; //переобразует в ссылку
        String blank = "_blank";

        char dm = (char) 34; // символ двойные кавычки, чтобы составить html тег


        InputStream response = null;
        try {
            response = new URL(url).openStream();


            Scanner scanner = new Scanner(response);
            String responseBody = scanner.useDelimiter("\\A").next();

            String titleFromSite = responseBody.substring(responseBody.indexOf("<title>") + 7, responseBody.indexOf("</title>"));

            if (!titleFromSite.equals("Google Документы ‒ бесплатно создавайте и редактируйте документы в Интернете.") && !titleFromSite.equals("Google Таблицы ‒ бесплатно создавайте и редактируйте таблицы в Интернете.") && !titleFromSite.contains("Яндекс.Карты") && !titleFromSite.equals("Обратная связь - Группа медицинских компаний студия") && !titleFromSite.equals("МТС-Банк") && !titleFromSite.contains("РУСХИТ") && !titleFromSite.equals("Срочноденьги Заявка") && !titleFromSite.equals("Яндекс") && !titleFromSite.equals("Страница оплаты") && !titleFromSite.equals("Корзина") && !titleFromSite.contains("Авито") && !titleFromSite.contains("PeoplePass") && !titleFromSite.equals("QIWI") && !titleFromSite.contains("секс") && !titleFromSite.contains("mistery") && !titleFromSite.contains("xvideo") && !titleFromSite.contains("porno") && !titleFromSite.contains("Telegraph") && !titleFromSite.contains("Ташкент") && !titleFromSite.equals("Get Laid Tonight") && !titleFromSite.equals("PravSistem.Club") && !titleFromSite.equals("Оплата") && !titleFromSite.contains("Линзмастер") && !titleFromSite.contains("Квартиры свободные") && !titleFromSite.equals("Статус заказа") && !titleFromSite.equals("Пройди тест на денежное мышление") && !titleFromSite.equals("Index - MerchantNew") && !titleFromSite.equals(" Google Карты ") && !titleFromSite.equals("Яндекс.Картинки") && !titleFromSite.equals("Best dating worldwide") && !titleFromSite.equals("МВД РОССИИ: УВЕДОМЛЕНИЕ О ШТРАФЕ") && !titleFromSite.contains("html") && !titleFromSite.equals("New phoenix") && !titleFromSite.equals("Ru_kitchent at Taplink") &&  !titleFromSite.equals("Самолет") && !titleFromSite.equals("Оценка курьера") && !titleFromSite.equals("Добро пожаловать!") &&  !titleFromSite.equals("Срочноденьги Заявка") && !titleFromSite.equals("Расчёт стоимости полиса ОСАГО онлайн") && !titleFromSite.equals("axilog.ru - служба доставки") && !titleFromSite.equals("Ваш заказ | Вилгуд") && !titleFromSite.equals("Как самозанятым получать бесплатные смены  — Яндекс.Про") && !titleFromSite.equals("Оплата квитанций ГУП ВЦКП | ЮMoney") &&  !titleFromSite.equals("") && !titleFromSite.equals("ЮMoney") && !titleFromSite.equals("Короткий URL для всех!") && !titleFromSite.equals(" ") && !titleFromSite.equals("ЮMoney - Штрафы") && !titleFromSite.equals("Ой!") && !titleFromSite.equals("Redirecting...") && !titleFromSite.equals("Warning! | There might be a problem with the requested link")) {
                System.out.println(++actual + ". " + url + " - " + titleFromSite + " (№: " + count+")");
            }

//            if (titleFromSite.contains("Оформить ОСАГО"))
//                System.out.println(++actual + ". " + url + " - " + titleFromSite + " (№: " + count+")");

        } catch (Exception ex) {
//            ex.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (Exception ex) {
//                ex.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        System.out.println("Работу начал...");
        for (int i = 0; i < 500_000; i++) {
//            System.out.println("Попытка №: " + count);
            randd();
            count++;
        }
        System.out.println("completed");
    }
}
