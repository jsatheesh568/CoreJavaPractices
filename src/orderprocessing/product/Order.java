package CoreJavaPractices.orderprocessing.product;

import CoreJavaPractices.orderprocessing.exception.InvalidDiscountException;
import CoreJavaPractices.orderprocessing.model.Customer;

import java.util.List;
import java.util.UUID;

public record Order(UUID id, Customer customer, List <Product> products, double discount) {
    public Order {
        if (discount < 0 || discount > 50) {
            throw new InvalidDiscountException ("Discount must be between 0% and 50%");
        }
    }

    public double calculateTotal() {
        return products.stream()
                .mapToDouble(Product::price)
                .sum() * (1 - discount / 100);
    }
}
