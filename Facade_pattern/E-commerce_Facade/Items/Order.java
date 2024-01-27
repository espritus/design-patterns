package project.com.Items;

public class Order {
    private Product product;
    private int quantity;

    public Order(Product product,int quantity){
        this.product = product;
        this.quantity = quantity;

    }
    public String getName(){
        return this.product.getName();
    }
    public int getQuantity(){
        return this.quantity;
    }
}
