package project.com.Systems;

import project.com.Items.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private static List<Product> catalog = new ArrayList<>();

    public List<Product> getProducts() {
        catalog();
        return catalog;
    }
    public Product getProductById(int i){
        return catalog.get(i);
    }

    public static void catalog(){
        catalog.add(new Product("Apple"));
        catalog.add(new Product("Pineapple"));
        catalog.add(new Product("Strawberry"));
    }
}
