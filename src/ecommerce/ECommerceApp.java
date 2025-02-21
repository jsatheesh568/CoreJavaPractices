package CoreJavaPractices.src.ecommerce;

import CoreJavaPractices.src.ecommerce.discount.DiscountService;
import CoreJavaPractices.src.ecommerce.discount.DiscountServiceImpl;
import CoreJavaPractices.src.ecommerce.order.Order;
import CoreJavaPractices.src.ecommerce.order.OrderService;
import CoreJavaPractices.src.ecommerce.product.ProductService;

import java.util.Arrays;
import java.util.List;

public class ECommerceApp {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        DiscountService discountService = new DiscountServiceImpl ();
        OrderService orderService = new OrderService (productService, discountService);

        // 🔹 Available Products
        System.out.println("Available Products:");
        productService.getProducts().forEach(System.out::println);

        // 🔹 Creating Order
        System.out.println("\nCreating Order...");
        List <String> shoppingCart = Arrays.asList("Laptop", "T-Shirt","Oil");
        Order order = orderService.createOrder(shoppingCart);
        System.out.println(order);
    }
}
