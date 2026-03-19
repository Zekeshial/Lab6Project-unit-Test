import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @org.junit.jupiter.api.Test
    void addBook() {

        String[] authorsBook1 = {"Author One", "Author Two"};
        String[] authorsBook2 = {"Author One"};

        Book book1 = new Book( "Test Title", authorsBook1, "Test ISBN", 0, 0);
        Book book2 = new Book( "Test Title2", authorsBook2, "Test ISBN", 10100, 2024);
        Book book3 = new Book( "Test Title3", new String []{"Authors One"}, "Test ISBN", 10100, 2024);
        Book book4 = new Book( "Test Title4", new String []{"Authors Four", "Author One"}, "Test ISBN", 10100, 2024);

        Library UMD = new Library();

        UMD.addBook(book1);
        UMD.addBook(book2);
        UMD.addBook(book3);
        UMD.addBook(book4);

        ArrayList<Book> actual = new ArrayList<>();

        actual.add(book1);
        actual.add(book2);
        actual.add(book3);
        actual.add(book4);



        assertEquals(actual, UMD.getCollection());

    }

    @org.junit.jupiter.api.Test
    void removeBook() {
        String[] authorsBook1 = {"Author One", "Author Two"};
        String[] authorsBook2 = {"Author One"};

        Book book1 = new Book( "Test Title", authorsBook1, "Test ISBN", 0, 0);
        Book book2 = new Book( "Test Title2", authorsBook2, "Test ISBN", 10100, 2024);
        Book book3 = new Book( "Test Title3", new String []{"Authors One"}, "Test ISBN", 10100, 2024);
        Book book4 = new Book( "Test Title4", new String []{"Authors Four", "Author One"}, "Test ISBN", 10100, 2024);

        Library UMD = new Library();

        UMD.addBook(book1);
        UMD.addBook(book2);
        UMD.addBook(book3);
        UMD.addBook(book4);

        UMD.removeBook(book3);

        ArrayList<Book> actual = new ArrayList<>();

        actual.add(book1);
        actual.add(book2);
        actual.add(book4);



        assertEquals(actual, UMD.getCollection());

    }

    @org.junit.jupiter.api.Test
    void checkBookCollectionStatus() {
        String[] authorsBook1 = {"Author One", "Author Two"};
        String[] authorsBook2 = {"Author One"};

        Book book1 = new Book( "Test Title", authorsBook1, "Test ISBN", 0, 0);
        Book book2 = new Book( "Test Title2", authorsBook2, "Test ISBN", 10100, 2024);
        Book book3 = new Book( "Test Title3", new String []{"Authors One"}, "Test ISBN", 10100, 2024);
        Book book4 = new Book( "Test Title4", new String []{"Authors Four", "Author One"}, "Test ISBN", 10100, 2024);

        Library UMD = new Library();

        UMD.addBook(book1);
        UMD.addBook(book2);
        UMD.addBook(book3);
        UMD.addBook(book4);

        assertTrue(UMD.checkBookCollectionStatus(book1));
    }

    @org.junit.jupiter.api.Test
    void checkBookCollectionStatus2() {
        String[] authorsBook1 = {"Author One", "Author Two"};
        String[] authorsBook2 = {"Author One"};

        Book book1 = new Book( "Test Title", authorsBook1, "Test ISBN", 0, 0);
        Book book2 = new Book( "Test Title2", authorsBook2, "Test ISBN", 10100, 2024);
        Book book3 = new Book( "Test Title3", new String []{"Authors One"}, "Test ISBN", 10100, 2024);
        Book book4 = new Book( "Test Title4", new String []{"Authors Four", "Author One"}, "Test ISBN", 10100, 2024);

        Library UMD = new Library();

        UMD.addBook(book1);
        UMD.addBook(book2);
        UMD.addBook(book3);


        assertFalse(UMD.checkBookCollectionStatus(book4));
    }

    @org.junit.jupiter.api.Test
    void checkoutBook() {

        String[] authorsBook1 = {"Author One", "Author Two"};
        String[] authorsBook2 = {"Author One"};

        Book book1 = new Book( "Test Title", authorsBook1, "Test ISBN", 0, 0);
        Book book2 = new Book( "Test Title2", authorsBook2, "Test ISBN", 10100, 2024);
        Book book3 = new Book( "Test Title3", new String []{"Authors One"}, "Test ISBN", 10100, 2024);
        Book book4 = new Book( "Test Title4", new String []{"Authors Four", "Author One"}, "Test ISBN", 10100, 2024);

        Library UMD = new Library();

        UMD.addBook(book1);
        UMD.addBook(book2);
        UMD.addBook(book3);
        UMD.addBook(book4);

        UMD.checkoutBook(book3);

        assertFalse(book3.isStatus());
    }

    @org.junit.jupiter.api.Test
    void checkoutBook2() {

        String[] authorsBook1 = {"Author One", "Author Two"};
        String[] authorsBook2 = {"Author One"};

        Book book1 = new Book( "Test Title", authorsBook1, "Test ISBN", 0, 0);
        Book book2 = new Book( "Test Title2", authorsBook2, "Test ISBN", 10100, 2024);
        Book book3 = new Book( "Test Title3", new String []{"Authors One"}, "Test ISBN", 10100, 2024);
        Book book4 = new Book( "Test Title4", new String []{"Authors Four", "Author One"}, "Test ISBN", 10100, 2024);

        Library UMD = new Library();

        UMD.addBook(book1);
        UMD.addBook(book2);
        UMD.addBook(book4);

        UMD.checkoutBook(book3);


        assertTrue(book3.isStatus());
    }

    @Test
    void checkInBook() {
        String[] authorsBook1 = {"Author One", "Author Two"};
        String[] authorsBook2 = {"Author One"};

        Book book1 = new Book( "Test Title", authorsBook1, "Test ISBN", 0, 0);
        Book book2 = new Book( "Test Title2", authorsBook2, "Test ISBN", 10100, 2024);
        Book book3 = new Book( "Test Title3", new String []{"Authors One"}, "Test ISBN", 10100, 2024);
        Book book4 = new Book( "Test Title4", new String []{"Authors Four", "Author One"}, "Test ISBN", 10100, 2024);

        Library UMD = new Library();

        UMD.addBook(book1);
        UMD.addBook(book2);
        UMD.addBook(book3);
        UMD.addBook(book4);

        UMD.checkoutBook(book3);

        UMD.checkInBook(book3);

        assertTrue(book3.isStatus());
    }

    @Test
    void checkInBook2() {
        String[] authorsBook1 = {"Author One", "Author Two"};
        String[] authorsBook2 = {"Author One"};

        Book book1 = new Book( "Test Title", authorsBook1, "Test ISBN", 0, 0);
        Book book2 = new Book( "Test Title2", authorsBook2, "Test ISBN", 10100, 2024);
        Book book3 = new Book( "Test Title3", new String []{"Authors One"}, "Test ISBN", 10100, 2024);
        Book book4 = new Book( "Test Title4", new String []{"Authors Four", "Author One"}, "Test ISBN", 10100, 2024);

        Library UMD = new Library();

        UMD.addBook(book1);
        UMD.addBook(book2);
        UMD.addBook(book3);
        UMD.addBook(book4);

        UMD.checkoutBook(book3);

        UMD.checkInBook(book3);

        UMD.checkInBook(book3);

        assertTrue(book3.isStatus());
    }

    @Test
    void checkInBook3() {
        String[] authorsBook1 = {"Author One", "Author Two"};
        String[] authorsBook2 = {"Author One"};

        Book book1 = new Book( "Test Title", authorsBook1, "Test ISBN", 0, 0);
        Book book2 = new Book( "Test Title2", authorsBook2, "Test ISBN", 10100, 2024);
        Book book3 = new Book( "Test Title3", new String []{"Authors One"}, "Test ISBN", 10100, 2024);
        Book book4 = new Book( "Test Title4", new String []{"Authors Four", "Author One"}, "Test ISBN", 10100, 2024);

        Library UMD = new Library();

        UMD.addBook(book1);
        UMD.addBook(book2);
        UMD.addBook(book4);

        UMD.checkoutBook(book3);

        UMD.checkInBook(book3);

        UMD.checkInBook(book3);

        assertTrue(book3.isStatus());
    }

    @org.junit.jupiter.api.Test
    void getTotalBooks() {

        String[] authorsBook1 = {"Author One", "Author Two"};
        String[] authorsBook2 = {"Author One"};

        Book book1 = new Book( "Test Title", authorsBook1, "Test ISBN", 0, 0);
        Book book2 = new Book( "Test Title2", authorsBook2, "Test ISBN", 10100, 2024);
        Book book3 = new Book( "Test Title3", new String []{"Authors One"}, "Test ISBN", 10100, 2024);
        Book book4 = new Book( "Test Title4", new String []{"Authors Four", "Author One"}, "Test ISBN", 10100, 2024);

        Library UMD = new Library();

        UMD.addBook(book1);
        UMD.addBook(book2);
        UMD.addBook(book3);
        UMD.addBook(book4);


        assertEquals(4, UMD.getTotalBooks());
    }

    @org.junit.jupiter.api.Test
    void booksCheckoutNum() {
        String[] authorsBook1 = {"Author One", "Author Two"};
        String[] authorsBook2 = {"Author One"};

        Book book1 = new Book( "Test Title", authorsBook1, "Test ISBN", 0, 0);
        Book book2 = new Book( "Test Title2", authorsBook2, "Test ISBN", 10100, 2024);
        Book book3 = new Book( "Test Title3", new String []{"Authors One"}, "Test ISBN", 10100, 2024);
        Book book4 = new Book( "Test Title4", new String []{"Authors Four", "Author One"}, "Test ISBN", 10100, 2024);

        Library UMD = new Library();

        UMD.addBook(book1);
        UMD.addBook(book2);
        UMD.addBook(book3);
        UMD.addBook(book4);

        UMD.checkoutBook(book3);
        UMD.checkInBook(book3);

        UMD.checkoutBook(book3);
        UMD.checkInBook(book3);

        UMD.checkoutBook(book3);
        UMD.checkInBook(book3);

        UMD.checkoutBook(book3);
        UMD.checkInBook(book3);

        assertEquals(4, book3.getCheckOutNum());
    }
}