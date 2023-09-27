package module_2.io_binary_file.repository.impl;


import module_2.io_binary_file.model.Product;
import module_2.io_binary_file.repository.IProductRepo;
import module_2.io_binary_file.utils.impl.AbstractUtils;

import java.util.ArrayList;
import java.util.List;

public class ProductRepoImpl extends AbstractUtils<Product> implements IProductRepo<Product> {
    private final String PATH = "C:\\Users\\ADMIN\\Documents\\GitProject\\Module_2\\Introduction\\src\\module_2\\io_binary_file\\data\\product.dat";

    @Override
    public void addProduct(Product product) {
        List<Product> products = displayAll();
        products.add(product);
        writeByByteStream(PATH, products);
    }

    @Override
    public List<Product> displayAll() {
        List<Product> products = readByByteStream(PATH);
        return products;
    }

    @Override
    public Product displayDetail(int id) {
        List<Product> products = displayAll();
        for(Product product: products){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }
}
