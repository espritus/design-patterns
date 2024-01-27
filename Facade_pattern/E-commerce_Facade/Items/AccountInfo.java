package project.com.Items;

import project.com.Systems.InventoryManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AccountInfo {
    private String name;
    private String cardStatus;
    private List<Order> myorders = new ArrayList<>();

    private InventoryManager inventoryManager;

    public AccountInfo(String name, String cardStatus){
        this.cardStatus = cardStatus;
        this.name = name;
    }
    public List<Order> getOrders(){
        return this.myorders;
    }

    public void addOrder(Order order) {
        myorders.add(order);
    }
    public String getCardStatus(){
        return this.cardStatus;
    }

    public Object getUsername() {
        return this.name;
    }
}
