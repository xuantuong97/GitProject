package module_2.product_manager.view;

import module_2.access_modifier.student_access_modifier.Student;
import module_2.product_manager.controller.ProductManagerController;
import module_2.product_manager.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagerView {

    private final ProductManagerController productManagerController = new ProductManagerController();

    private Scanner scanner = new Scanner(System.in);

    public void addProduct(){
        System.out.println("Enter the ID product:");
        String id = scanner.nextLine();

        System.out.println("Enter the name of product:");
        String name = scanner.nextLine();

        System.out.println("Enter the price of product:");
        Integer price = Integer.parseInt(scanner.nextLine());

        Product product = new Product(id, name, price);

        productManagerController.addProduct(product);
    }

    public void displayProducts(){
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

    public void ascShort(){
        productManagerController.ascendingShort();
        displayProducts();
    }

    public void descShort(){
        productManagerController.descendingShort();
        displayProducts();
    }

    public void addT(Student student){
        productManagerController
    }
}
