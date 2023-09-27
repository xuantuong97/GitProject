package module_2.io_binary_file.repository;

import java.util.List;

public interface IProductRepo<O> {

    void addProduct(O o);

    List<O> displayAll();

    O displayDetail (int id);
}
