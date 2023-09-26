package module_2.io_binary_file.service.impl;

import module_2.io_binary_file.model.Product;
import module_2.io_binary_file.repository.IProductRepo;
import module_2.io_binary_file.repository.impl.ProductRepoImpl;
import module_2.io_binary_file.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final IProductRepo productRepo = new ProductRepoImpl();

    @Override
    public void addProduct(Product product) {
        productRepo.addProduct(product);

    }

    @Override
    public List<Product> displayAll() {
        return productRepo.displayAll();
    }

    @Override
    public Product displayDetail(int id) {
        return (Product) productRepo.displayDetail(id);
    }
}
