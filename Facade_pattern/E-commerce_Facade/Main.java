package project.com;


import project.com.Items.Product;
import project.com.Systems.*;

public class Main {
    private static AccountManager accountManager;
    private static ProductCatalog catalog;

    public static void main(String[] args) {
        setUp();// наши сабсистемы
        CommerceSystemFacade facade = new CommerceSystemFacadeImpl();
        facade.browseProducts();
        accountManager.createAccount("Alisa","Visa"); //создаем пользователя
        accountManager.createAccount("Sabina","NO Visa"); // выдаст предупреждение так как дата карты не правильная
        Product one = catalog.getProductById(1); // после того как посмотрели католог можно выбрать продукт

        facade.addToCart(one,10);
        facade.checkout(accountManager.getUserByUsername("Alisa"));//проверит данные карты и создаст заказ

        facade.viewOrderHistory(accountManager.getUserByUsername("Alisa"));// покажет наш заказ(ы)

    }

    public static void setUp() {
        accountManager = new AccountManager();
        catalog = new ProductCatalog();
    }
}
