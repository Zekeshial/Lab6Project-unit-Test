public class Book {

    private String title, ISBN;
    private String[] authors;
    private double price;
    private int publishedYear, checkOutNum;
    private boolean status;


    public Book(String title, String[] authors, String ISBN, double price, int publishedYear) {
        this.title = title;
        this.authors = authors;
        this.ISBN = ISBN;
        this.price = price;
        this.publishedYear = publishedYear;
        this.checkOutNum = 0;
        this.status = true;
    }


    public Book() {
        title = null;
        authors = null;
        ISBN = null;
        price = 0;
        publishedYear = 0;
        this.checkOutNum = 0;
        this.status = true;
    }




    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public int getCheckOutNum() {
        return checkOutNum;
    }

    public void setCheckOutNum(int checkOutNum) {
        this.checkOutNum = checkOutNum;
    }

    public void addOneCheckOutNum() {
        checkOutNum += 1;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
