import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testGetTitle() {
        String[] authors = {"Author One"};
        Book book = new Book( "Test Title", authors, "Test ISBN", 0, 0);

        assertEquals("Test Title", book.getTitle());
    }

}