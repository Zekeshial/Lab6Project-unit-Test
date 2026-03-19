import java.util.ArrayList;


public class Library {

    private ArrayList<Book> collection;

    public Library() {
        this.collection = new ArrayList<>();
    }

    public ArrayList<Book> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Book> collection) {
        this.collection = collection;
    }

    public void addBook(Book book) {
        collection.add(book);
    }

    public void removeBook(Book book) {
        collection.remove(book);
    }

    public boolean checkBookCollectionStatus(Book chosenBook) {
        if (collection.contains(chosenBook)) {
            return true;
        } else {
            return false;
        }
    }

    public void checkoutBook(Book book) {
        if (checkBookCollectionStatus(book) && book.isStatus()) {
            book.setStatus(false);
            book.addOneCheckOutNum();
            System.out.println("You have checked out the book");
        } else {
            System.out.println("The book doesn't exist in the Library or is checked out.");
        }
    }

    public void checkInBook(Book chosenBook) {
        if (checkBookCollectionStatus(chosenBook) && !chosenBook.isStatus()) {
            chosenBook.setStatus(true);
            System.out.println("Book has been checked in");
        } else {
            System.out.println("The book is still in the Library or doesn't exist.");
        }
    }

    public int getTotalBooks() {
        return collection.size();
    }

    public int booksCheckoutNum (Book chosenbook) {
        return chosenbook.getCheckOutNum();
    }




}
