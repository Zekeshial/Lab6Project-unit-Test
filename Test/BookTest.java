import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    @Test
    void testGetters() {

        String[] authors = {"Author One"};
        Book book = new Book( "Test Title", authors, "Test ISBN", 0, 0);

        assertEquals("Test Title", book.getTitle());
        assertEquals(authors, book.getAuthors());
        assertEquals("Test ISBN", book.getISBN());
        assertEquals(0, book.getPrice());
        assertEquals(2024, book.getPublishedYear());
        assertTrue(book.isStatus());
    }


}