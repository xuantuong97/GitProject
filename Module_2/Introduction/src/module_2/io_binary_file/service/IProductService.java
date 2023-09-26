package module_2.io_binary_file.service;

import module_2.io_binary_file.model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    List<Product> displayAll();

    Product displayDetail (int id);
}
