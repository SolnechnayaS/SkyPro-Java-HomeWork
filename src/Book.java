public class Book {
    private final Author author;
    private String bookName;
    private int bookPublishingYear;

    public Book(Author author, String bookName, int bookPublishingYear) {
        this.author = author;
        this.bookName = bookName;
        this.bookPublishingYear = bookPublishingYear;

    }

    public String getAuthorFullName() {
        String authorFullName = this.author.getFullName();
        return authorFullName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getBookPublishingYear() {
        return this.bookPublishingYear;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookPublishingYear(int bookPublishingYear) {
        this.bookPublishingYear = bookPublishingYear;
    }

}
