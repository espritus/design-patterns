package project.com;

import java.util.List;

public interface FacadeBookSystem{
    void borrowBook(String bookTitle, String username);
    void returnBook(String bookTitle, String username);
     List<Book> searchBookByTitle(String title);
    List<Book> searchBookByAuthor(String author);
    boolean isBookAvailable(String bookTitle);
}
