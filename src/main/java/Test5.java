public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Books().getAuthor());
    }
}

class Books{
    String book = "Wire";
    String author = "Roman";
    String name = "hello";

    public Books(String book, String author, String name) {
        this.book = book;
        this.author = author;
        this.name = name;
    }

    public Books() {

    }

    public String getBook() {
        return book;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}