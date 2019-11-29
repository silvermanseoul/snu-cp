import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        Book book = new TextBook(title);
        if(book instanceof Book){
            System.out.println("Class : " + book.getClass());
        }
        book.read();
    }
}
class Book{
    protected String title;
    Book(String s){
        this.title = s;
    }
    void read(){
        System.out.println("Title : "+ title);
        System.out.println("Reading");
    }
}

class TextBook extends Book {
    TextBook(String s) {
        super(s);
    }
    @Override
    void read(){
        System.out.println("Title : "+ title);
        System.out.println("Unwilling");
    }
}

