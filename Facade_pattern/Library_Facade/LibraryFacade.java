package project.com;

import java.util.List;

public class LibraryFacade implements FacadeBookSystem{
    private UserManagement userManagement;
    private BookInventory bookInventory;

    public LibraryFacade(BookInventory bookInventory, UserManagement userManagement) {
        this.bookInventory = bookInventory;
        this.userManagement = userManagement;
    }

    @Override
    public void borrowBook(String bookTitle, String username) {
        Book book = bookInventory.getBookByTitle(bookTitle);
        if (book != null && book.isAvailable()) {
            User user = userManagement.getUserByUsername(username);
            if (user != null) {
                book.setAvailable(false);
                book.setBorrower(user);
                user.borrowBook(book);
            }
        }
    }

    @Override
    public void returnBook(String bookTitle, String username) {
        Book book = bookInventory.getBookByTitle(bookTitle);
        if (book != null && !book.isAvailable() && book.getBorrower().getUsername().equals(username)) {
            User user = userManagement.getUserByUsername(username);
            if (user != null) {
                book.setAvailable(true);
                book.setBorrower(null);
                user.returnBook(book);
            }
        }
    }

    @Override
    public List<Book> searchBookByTitle(String title) {
        return bookInventory.searchBookByTitle(title);
    }

    @Override
    public List<Book> searchBookByAuthor(String author) {
        return bookInventory.searchBookByAuthor(author);
    }

    @Override
    public boolean isBookAvailable(String bookTitle) {
        Book book = bookInventory.getBookByTitle(bookTitle);
        return book != null && book.isAvailable();
    }
}

