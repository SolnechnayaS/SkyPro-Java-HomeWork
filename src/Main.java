public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Астрид", "Эриксон");
        author1.setLastName("Линдгрен"); //уточнение фамилии автора

        Author author2 = new Author("Жюль", "Верн");

        Book book1 = new Book(author1, "Пе́ппи Дли́нныйчуло́к", 1945);
        printBookMedia(book1);

        Book book2 = new Book(author2, "Дети Капитана Гранда", 1865);
        printBookMedia(book2);

        book2.setBookName("Дети капитана Гранта"); //исправлены орфорграфиеские ошибки в названии книги
        book2.setBookPublishingYear(1867); //уточнена дата издания книги
        printBookMedia(book2);
    }

    public static void printBookMedia(Book book) {
        System.out.println("\nДанные о книге:" + "\nАвтор: " + book.getAuthorFullName() + "\nНазвание книги: " + book.getBookName() + "\nГод издания книги: " + book.getBookPublishingYear());
    }
}