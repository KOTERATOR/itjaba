package ru.mirea.it;

public class TestBook {
    public static void test() {
        Book book = new Book("Title 1", new String[]{"Page 1", "Page 2", "Page 3"}, "Author 1", "Genre 1");
        System.out.println(book);

        book = new Book("Title 2", new String[] {"Title Page", "End Page"}, "John");
        System.out.println(book);

        book = new Book("Untitled", new String[] {"Untitled title page", "Title", "The End."});
        System.out.println(book);

        book.setTitle("Untitled untitle");
        book.setPages(new String[] {"Erased"});
        book.setGenre("Genre 1");
        book.setAuthor("Unauthor");

        String firstPage = book.getPage(1);
        int pagesCount = book.getPagesCount();
        System.out.printf("Book - title=\"%s\", pages_count=%d, first_page=\"%s\", genre=\"%s\", author=\"%s\"%n", book.getTitle(), pagesCount, firstPage, book.getGenre(), book.getAuthor());

        System.out.println(book);
    }
}
