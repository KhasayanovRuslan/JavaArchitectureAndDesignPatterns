import java.util.HashMap;

public class IdentityMap {
    private static IdentityMap instance = new IdentityMap();
    private HashMap<Long, Book> books = new HashMap<Long, Book>();

    public IdentityMap() {

    }

    public static void addBook(Book book) {
        instance.books.put(book.getId(), book);
    }

    public static Book getBook(Long id) {
        return instance.books.get(id);
    }
}