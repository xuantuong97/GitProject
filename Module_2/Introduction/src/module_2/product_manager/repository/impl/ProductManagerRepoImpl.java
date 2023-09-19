package module_2.product_manager.repository.impl;

import module_2.access_modifier.student_access_modifier.Student;
import module_2.product_manager.model.Product;
import module_2.product_manager.repository.IProductManagerRepo;

import java.util.*;

public class ProductManagerRepoImpl implements IProductManagerRepo {

    private ArrayList<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void updateName(String name, int index) {
        products.get(index).setProductName(name);
    }

    @Override
    public void updatePrice(Integer price, int index) {
        products.get(index).setProductPrice(price);
    }

    @Override
    public void removeProduct(int index) {
        products.remove(index);
    }

    @Override
    public Product searchProduct(int index) {
        return products.get(index);
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        return products;
    }

    @Override
    public void ascendingShort() {
        Ascending ascending = new Ascending();

        Collections.sort(products, ascending);
    }

    @Override
    public void descendingShort() {
        Descending descending = new Descending();

        Collections.sort(products, descending);
    }
}
