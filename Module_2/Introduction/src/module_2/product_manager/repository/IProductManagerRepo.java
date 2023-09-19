package module_2.product_manager.repository;

import module_2.product_manager.model.Product;

import java.util.ArrayList;

public interface IProductManagerRepo {

    void addProduct(Product product);

    void updateName(String name, int index);

    void updatePrice(Integer price, int index);

    void removeProduct(int index);

    ArrayList<Product> getAllProducts();

    Product searchProduct(int index);

    void ascendingShort();

    void descendingShort();
}
