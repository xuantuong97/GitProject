package module_2.product_manager.view;

import module_2.access_modifier.student_access_modifier.Student;
import module_2.product_manager.controller.ProductManagerController;
import module_2.product_manager.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagerView {

    private final ProductManagerController productManagerController = new ProductManagerController();

    private Scanner scanner = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("Please choose option" +
                "\n 1. Add a product." +
                "\n 2. Display all products." +
                "\n 3. Remove a product." +
                "\n 4. Search a product" +
                "\n 5. Update a product." +
                "\n 6. Sort product list." +
                "\n 7. Exit.");

        int choose = Integer.parseInt(scanner.nextLine());

        switch (choose){
            case 1:
                addProduct();
                displayMenu();
                break;
            case 2:
                displayProducts();
                displayMenu();
                break;
            case 3:
                removeProduct();
                displayMenu();
                break;
            case 4:
                searchProduct();
                displayMenu();
                break;
            case 5:
                updateProduct();
                displayMenu();
                break;
            case 6:
                sortProduct();
                displayMenu();
                break;
            case 7:
            default:
                break;
        }
    }

    private void addProduct(){
        System.out.println("Enter the ID product:");
        String id = scanner.nextLine();

        System.out.println("Enter the name of product:");
        String name = scanner.nextLine();

        System.out.println("Enter the price of product:");
        Integer price = Integer.parseInt(scanner.nextLine());

        Product product = new Product(id, name, price);

        productManagerController.addProduct(product);
    }

    private void displayProducts(){
        for(Product product: productManagerController.getAllProducts()){
            System.out.println(product.toString());
        }
    }

    private int getIndex(String id){
        int index = -1;
        ArrayList<Product> products = productManagerController.getAllProducts();
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    private void removeProduct(){
        System.out.println("Enter ID product");
        String id = scanner.nextLine();
        int index = getIndex(id);
        if(index == -1){
            System.out.println("ID product is not exist!");
        }
        else {
            productManagerController.removeProduct(index);
            System.out.println("The product has been removed");
        }
    }

    private void searchProduct(){
        System.out.println("Enter ID product");
        String id = scanner.nextLine();

        int index = getIndex(id);

        if (index == -1){
            System.out.println("ID product is not exist!");
        }
        else {
            System.out.println(productManagerController.searchProduct(index));
        }
    }

    private void updateProduct(){
        System.out.println("Enter ID product");
        String id = scanner.nextLine();

        int index = getIndex(id);

        if (index == -1){
            System.out.println("ID product is not exist!");
        }
        else {
            System.out.println("Please choose a option:" +
                    "\n1. Update name" +
                    "\n2. Update price" +
                    "\n3. Update both");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    System.out.println("Enter new name:");
                    String name = scanner.nextLine();
                    productManagerController.updateName(name, index);
                    break;

                case 2:
                    System.out.println("Enter new price");
                    Integer price = Integer.parseInt(scanner.nextLine());
                    productManagerController.updatePrice(price, index);
                    break;
                case 3:
                    System.out.println("Enter new name:");
                    String name1 = scanner.nextLine();
                    System.out.println("Enter new price");
                    Integer price1 = Integer.parseInt(scanner.nextLine());
                    productManagerController.updateName(name1, index);
                    productManagerController.updatePrice(price1, index);
                    break;
                default:
                    break;
            }
        }
    }

    private void ascShort(){
        productManagerController.ascendingShort();
        displayProducts();
    }

    private void descShort(){
        productManagerController.descendingShort();
        displayProducts();
    }

    private void sortProduct(){
        System.out.println("Please choose option" +
                "\n 1. Ascending order." +
                "\n 2. Descending order.");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1: ascShort();
                break;
            case 2: descShort();
                break;
            default:
                break;
        }
    }

    public void addTest(Product product){
        productManagerController.addProduct(product);
    }
}
