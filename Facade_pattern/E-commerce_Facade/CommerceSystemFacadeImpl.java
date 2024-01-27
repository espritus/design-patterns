package project.com;

import project.com.Items.*;
import project.com.Systems.*;

import java.util.List;

public class CommerceSystemFacadeImpl implements CommerceSystemFacade {
    private ProductCatalog productCatalog;

    private InventoryManager inventoryManager;
    private OrderProcess orderProcess;
    private AccountManager accountManager;
    private PaymentProcess paymentProcess;

    public CommerceSystemFacadeImpl() {
        productCatalog = new ProductCatalog();
        inventoryManager = new InventoryManager();
        orderProcess = new OrderProcess();
        accountManager = new AccountManager();
        paymentProcess = new PaymentProcess();
    }

    @Override
    public void browseProducts() {
        List<Product> res = productCatalog.getProducts();
        int i = 1;
        for (Product re : res) {
            System.out.println(i + ") " + re.getName());
            i++;
        }
    }

    @Override
    public void addToCart(Product product, int quantity) {
        inventoryManager.reserveInventory(product, quantity);
    }

    @Override
    public void checkout(AccountInfo account) {
        if(account!=null) {
            if (paymentProcess.processPayment(account)) {
                Order order = orderProcess.createOrder(inventoryManager);
                accountManager.addOrder(account, order);
            }
        }
    }

    @Override
    public void viewOrderHistory(AccountInfo account) {
        List<Order> res = accountManager.orderHistory(account);
        int i = 1;
        System.out.println("My order History : ");
        for (Order re : res) {
            System.out.println(i + ") " + re.getName() + ", Quantity: "+ re.getQuantity());
            i++;
        }
    }

}

