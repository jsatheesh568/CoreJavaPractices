package CoreJavaPractices.src.ecommerce.order;

import CoreJavaPractices.src.ecommerce.product.Product;

import java.util.List;

public class Order {
    private final List<Product> items;
    private final double totalPrice;

    public Order( List< Product > items, double totalPrice) {
        this.items = items;
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() { return totalPrice; }
    public List <Product> getItems() { return items; }

    @Override
    public String toString() {
        return "Order: " + items + " | Total Price: $" + totalPrice;
    }
}
