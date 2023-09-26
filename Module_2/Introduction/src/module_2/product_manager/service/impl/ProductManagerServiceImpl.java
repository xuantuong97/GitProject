package module_2.product_manager.service.impl;

import module_2.product_manager.model.Product;
import module_2.product_manager.repository.IProductManagerRepo;
import module_2.product_manager.repository.impl.ProductManagerRepoImpl;
import module_2.product_manager.service.IProductManagerService;

import java.util.ArrayList;

public class ProductManagerServiceImpl implements IProductManagerService {

    private final IProductManagerRepo productManagerRepo = new ProductManagerRepoImpl();

    @Override
    public void addProduct(Product product) {
        productManagerRepo.addProduct(product);
    }

    @Override
    public void updateName(String name, int index) {
        productManagerRepo.updateName(name, index);

    }

    @Override
    public void updatePrice(Integer price, int index) {
        productManagerRepo.updatePrice(price, index);
    }

    @Override
    public void removeProduct(int index) {
        productManagerRepo.removeProduct(index);
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        return productManagerRepo.getAllProducts();
    }

    @Override
    public Product searchProduct(int index) {
        return productManagerRepo.searchProduct(index);
    }

    @Override
    public void ascendingShort() {
        productManagerRepo.ascendingShort();
    }

    @Override
    public void descendingShort() {
        productManagerRepo.descendingShort();
    }
}
