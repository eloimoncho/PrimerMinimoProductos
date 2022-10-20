public class Product
{
    //Atributos

    String productId;
    String productName;
    double productPrice;

    public Product(String productId, String name, double price) {
        this.productId=productId;
        this.productName=name;
        this.productPrice=price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
