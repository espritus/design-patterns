package project.com;

import project.com.Items.AccountInfo;
import project.com.Items.Order;
import project.com.Items.Product;

import java.util.List;
import java.util.Map;

public interface CommerceSystemFacade {
    void browseProducts();
    void addToCart(Product product, int quantity);
    void checkout(AccountInfo account);
    void viewOrderHistory(AccountInfo account);

}
