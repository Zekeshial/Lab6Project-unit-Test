import java.util.ArrayList;
import java.util.HashMap;


public class Library {

    HashMap<Book, Boolean> collection = new HashMap();
    private boolean bookStatus;
    private int bookCheckOutCounter;

    public HashMap<Book, Boolean> getCollection() {
        return collection;
    }

    public void setCollection(HashMap<Book, Boolean> collection) {
        this.collection = collection;
    }

    public void addBook(Book book) {
        collection.put(book, true);
    }

    public void removeBook(Book book) {
        collection.remove(book);
    }

    public boolean checkBookStatus(Book chosenBook) {
        if (collection.containsKey(chosenBook)) {
            return collection.get(chosenBook);
        } else {
            return false;
        }
    }

    public void checkoutBook(Book book) {
        if (checkBookStatus(book)) {
            collection.put(book, false);
        } else {
            System.out.println("The book doesn't exist in the Library or is checked out.");
        }
    }

    public int getTotlaBooks() {
        return collection.size();
    }




}
