package project.com;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public User(String name){
        this.name = name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(0);
    }

    public String getUsername() {
        return this.name;
    }
}
