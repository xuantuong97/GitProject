package module_2.product_manager.controller;

import module_2.product_manager.model.Product;
import module_2.product_manager.service.IProductManagerService;
import module_2.product_manager.service.impl.ProductManagerServiceImpl;

import java.util.ArrayList;

public class ProductManagerController {



    private final IProductManagerService productManagerService = new ProductManagerServiceImpl();



    public void addProduct(Product product) {
        productManagerService.addProduct(product);
    }


    public void updateName(String name, int index) {
        productManagerService.updateName(name, index);

    }


    public void updatePrice(Integer price, int index) {
        productManagerService.updatePrice(price, index);
    }


    public void removeProduct(int index) {
        productManagerService.removeProduct(index);
    }


    public ArrayList<Product> getAllProducts() {
        return productManagerService.getAllProducts();
    }


    public Product searchProduct(int index) {
        return productManagerService.searchProduct(index);
    }


    public void ascendingShort() {
        productManagerService.ascendingShort();
    }


    public void descendingShort() {
        productManagerService.descendingShort();
    }
}
