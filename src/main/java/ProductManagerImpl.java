import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class ProductManagerImpl implements ProductManager{

    List<Product> listProducts;
    HashMap<String, User> users;
    Queue<Order> queueOrder;

    @Override
    public List<Product> productsByPrice() {
        return null;
    }

    @Override
    public List<Product> productsBySales() {
        return null;
    }

    @Override
    public void addOrder(Order order) {
        this.queueOrder.add(order);
    }

    @Override
    public Order processOrder() {
        return null;
    }

    @Override
    public List<Order> ordersByUser(String userId) {
        return null;
    }

    @Override
    public void addUser(String s, String name, String surname) {

        User a = new User(s,name,surname);
        this.users.put(s,a);
    }

    @Override
    public void addProduct(String productId, String name, double price) {
        Product p = new Product(productId,name,price);
        this.listProducts.add(p);
    }

    @Override
    public Product getProduct(String productId) {
        return null;
    }

    @Override
    public int numUsers() {
        return 0;
    }

    @Override
    public int numProducts() {
        return 0;
    }

    @Override
    public int numOrders() {
        return 0;
    }

    @Override
    public int numSales(String b001) {
        return 0;
    }
}
