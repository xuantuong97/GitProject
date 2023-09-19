package module_2.product_manager.model;

public class Product {

    private String id;

    private String productName;

    private Integer productPrice;

    public Product(){};

    public Product(String id, String productName, Integer productPrice) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public void setProduct(String name, Integer productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product ID: " + id
                + " Name: " + productName
                + " Price: " + productPrice ;
    }
}
