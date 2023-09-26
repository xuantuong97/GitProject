package module_2.io_binary_file.view;

import module_2.io_binary_file.controller.ProductController;
import module_2.io_binary_file.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private final ProductController productController = new ProductController();
    private final Scanner scanner = new Scanner(System.in);

    public void menu(){
        System.out.println("Choose option:");
        System.out.println("1. Add a new product");
        System.out.println("2. Display list of products");
        System.out.println("3. Search a product");
        System.out.println("4. Exit");

        int choose = Integer.parseInt(scanner.nextLine());

        switch (choose){
            case 1:
                addProduct();
                menu();
                break;
            case 2:
                displayProducts();
                menu();
                break;
            case 3:
                displayDetails();
                menu();
                break;
            case 5: break;
        }
    }

    private void addProduct(){
        int id = inputValidId();
        System.out.println("Enter product name");
        String name = scanner.nextLine();
        float price = inputValidPrice();
        System.out.println("Enter product manufacturer");
        String manufacturer = scanner.nextLine();
        System.out.println("Enter product description");
        String description = scanner.nextLine();

        Product product = new Product(id, name, price, manufacturer, description);
        productController.addProduct(product);
    }

    private void displayProducts(){
        List<Product> products = productController.displayAll();

        for(Product product: products){
            System.out.println(product);
        }
    }

    private void displayDetails(){
        int id = inputValidId();
        Product product = productController.displayDetail(id);

        if(product != null){
            System.out.println(product);
        }
        else {
            System.out.println("ID not found!");
        }
    }

    private int inputValidId(){
        do {
            try{
                System.out.println("Enter product ID");
                int number = Integer.parseInt(scanner.nextLine());
                return number;
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input");
            }
        }
        while (true);
    }

    private float inputValidPrice(){
        do {
            try{
                System.out.println("Enter product price");
                float number = Float.parseFloat(scanner.nextLine());
                return number;
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input");
            }
        }
        while (true);
    }
}
