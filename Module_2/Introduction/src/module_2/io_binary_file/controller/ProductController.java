package module_2.io_binary_file.controller;

import module_2.io_binary_file.model.Product;
import module_2.io_binary_file.service.IProductService;
import module_2.io_binary_file.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final IProductService productService = new ProductServiceImpl();


    public void addProduct(Product product) {
        productService.addProduct(product);

    }

    public List<Product> displayAll() {
        return productService.displayAll();
    }

    public Product displayDetail(int id) {
        return (Product) productService.displayDetail(id);
    }
}
