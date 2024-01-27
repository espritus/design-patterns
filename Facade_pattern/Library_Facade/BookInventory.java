package project.com;

import java.util.*;

public class BookInventory {

    private List<Book> bookList = new ArrayList<>();

    public Book getBookByTitle(String bookTitle) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTittle().equals(bookTitle)) {
                return bookList.get(i);
            }
        }
        return null;
    }

    public List<Book> searchBookByTitle(String title) {
        List<Book> res = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTittle().equals(title)) {
                res.add(bookList.get(i));
                return res;
            }
        }
        return null;
    }

    public List<Book> searchBookByAuthor(String author) {
        List<Book> res = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().equals(author)) {
                res.add(bookList.get(i));
                return res;
            }
        }
        return null;
    }

    public void getUserHistory(String bookName) {
        Book book = getBookByTitle(bookName);
        List<String> list = book.getUserHistory();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+1+") "+list.get(i));
        }
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void loadLibrary(){
        bookList.add(new Book( "William Makepeace Thackeray","Vanity Fair"));
        bookList.add(new Book("Paulo Coelho","The Alchemist"));
        bookList.add(new Book("Truman Capote","Breakfast at Tiffany's"));
    }
}
