package project.com.Systems;

import project.com.Items.Order;
import project.com.Items.Product;


public class InventoryManager {
    private Product product;
    private int quantity;

    public void reserveInventory(Product product, int quantity) {
     this.product = product;
     this.quantity = quantity;
    }

    public Order getInventory(){
        return new Order(product,quantity);
    }
}
