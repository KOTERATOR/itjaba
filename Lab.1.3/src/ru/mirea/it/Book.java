package ru.mirea.it;

public class Book {
    private String genre;
    private String author;
    private String title;
    private String[] pages;

    public Book(String title, String[] pages, String author, String genre) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.genre = genre;
    }

    public Book(String title, String[] pages, String author) {
        this(title, pages, author, "unknown genre");
    }

    public Book(String title, String[] pages) {
        this(title, pages, "unknown author");
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPage(int page) {
        if (page > 0 && page <= pages.length)
            return pages[page-1];
        else
            return "";
    }

    public void setPages(String[] pages) {
        this.pages = pages;
    }

    public int getPagesCount() {
        return pages.length;
    }

    @Override
    public String toString() {
        StringBuilder pagesContent = new StringBuilder();
        for (int i = 0; i < pages.length; i++) {
            pagesContent.append("\"");
            pagesContent.append(pages[i]);
            pagesContent.append("\"");
            if (i < pages.length - 1)
                pagesContent.append(", ");
        }
        return String.format("Book { title: \"%s\", author: \"%s\", genre: \"%s\", pages: [%s]}", title, author, genre, pagesContent);
    }
}
