package project.com;

public class Main {

    private static LibraryFacade libraryFacade;
    private static BookInventory bookInventory;
    private static UserManagement userManagement;

    public static void main(String[] args) {
        setUp();// наши сабсистемы

        User user = new User("John");// наши пользователи
        userManagement.addUser(user);
        User user1 = new User("Live");
        userManagement.addUser(user1);

        libraryFacade.borrowBook("Vanity Fair", "John");// Функция для регистрации книги на имя пользователя
        System.out.println(libraryFacade.isBookAvailable("Vanity Fair"));//false

        libraryFacade.returnBook("Vanity Fair","John");// Функция для возвращение книги
        System.out.println(libraryFacade.isBookAvailable("Vanity Fair"));// true

        libraryFacade.borrowBook("Vanity Fair", "Live");// Новый пользователь взял книгу

        bookInventory.getUserHistory("Vanity Fair");// Можно посмотреть какие пользователи брали книгу до этого

    }
    static void setUp(){
        bookInventory = new BookInventory();
        userManagement = new UserManagement();
        libraryFacade = new LibraryFacade(bookInventory, userManagement);
        bookInventory.loadLibrary();
    }
}
