package module_2.product_manager.view;

import module_2.product_manager.model.Product;

public class Main {
    public static void main(String[] args) {
        ProductManagerView productManagerView = new ProductManagerView();

        Product p1 = new Product("001","Ex", 20000);
        Product p2 = new Product("002","Ex", 10000);
        Product p3 = new Product("003","Ex", 25000);
        Product p4 = new Product("004","Ex", 2000);

        productManagerView.addTest(p1);
        productManagerView.addTest(p2);
        productManagerView.addTest(p3);
        productManagerView.addTest(p4);

        productManagerView.displayMenu();
    }
}
