package module_2.product_manager.repository.impl;

import module_2.product_manager.model.Product;

import java.util.Comparator;

public class Descending implements Comparator<Product> {

    private Product product = new Product();

    @Override
    public int compare(Product product1, Product product2) {
        return product2.getProductPrice() - product1.getProductPrice();
    }
}
