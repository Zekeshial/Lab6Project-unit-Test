import java.util.ArrayList;



public class Library {

    ArrayList<Book> collection = new ArrayList<>();


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

    public boolean checkBookStatus(Book chosenBook) {
        if (collection.contains(chosenBook)) {
            return true;
        } else {
            return false;
        }
    }

    public void checkoutBook(Book book) {
        if (checkBookStatus(book) && book.isStatus()) {
            book.setStatus(false);
            book.addOneCheckOutNum();
            System.out.println("You have checked out the book");
        } else {
            System.out.println("The book doesn't exist in the Library or is checked out.");
        }
    }

    public int getTotalBooks() {
        return collection.size();
    }

    public int booksCheckoutNum (Book chosenbook) {
        return chosenbook.getCheckOutNum();
    }




}
