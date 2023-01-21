
import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int publishyear;

    public Book(String bookName, Author author, int publishyear) {
        this.bookName = bookName;
        this.author = author;
        this.publishyear = publishyear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishyear() {
        return publishyear;
    }

    public void setPublishyear(int publishyear) {
        this.publishyear = publishyear;
    }

    @Override
    public boolean equals(Objects o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishyear == book.publishyear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publishyear);
    }
    @Override
    public String toString(){
        return "Book{"+
                "bookName+'"+bookName +'\''+
                ",author=" + author +
                ",publishYear="+publishyear+
                '}';
    }
    System.
}

