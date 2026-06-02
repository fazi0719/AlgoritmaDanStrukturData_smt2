package minggu_14;

public class Book06 {
    public String isbn;
    public String title;

    public Book06(){
    }

    public Book06(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }
    // Method toString() untuk menampilkan informasi buku
    public String toString(){
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}

