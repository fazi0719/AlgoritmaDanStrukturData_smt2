package minggu_14;
import java.util.Stack;

public class StackDemo06 {
    public static void main(String[] args) {
        Book06 book1 = new Book06("1234", "Dasar Pemrograman");
        Book06 book2 = new Book06("7145", "Hafalah Shalat Delisa");
        Book06 book3 = new Book06("3562", "Muhammad Al-Fatih");

        Stack<Book06> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book06 temp = books.peek();
        if (temp != null) {
            System.out.println(temp.toString());
        }
        Book06 temp2 = books.pop();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }
        for (Book06 book : books) {
            System.out.println(book.toString());
        }
        System.out.println(books);
        int posisi = books.search(book1);
        System.out.println("Posisi book1 dari top stack: " + posisi);
    }
}

