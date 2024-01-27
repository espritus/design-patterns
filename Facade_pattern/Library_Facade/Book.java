package project.com;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private boolean isAvailable = true;
    private User user;
    private String Author;
    private String Tittle;
    private List<String> userHistory = new ArrayList<>();

    public Book(String Author,String Tittle){
        this.Author = Author;
        this.Tittle = Tittle;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean b) {
        this.isAvailable = b;
    }

    public void setBorrower(User user) {
        this.user = user;
        if(user!=null){
        this.userHistory.add(user.getUsername());}
    }
    public List<String> getUserHistory(){
        return this.userHistory;
    }

    public User getBorrower() {
        return this.user;
    }
    public String getTittle(){
        return this.Tittle;
    }
    public String getAuthor(){
        return this.Author;
    }

}
