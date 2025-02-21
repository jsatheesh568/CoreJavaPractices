package CoreJavaPractices.src.ecommerce.order;

import CoreJavaPractices.src.ecommerce.discount.DiscountService;
import CoreJavaPractices.src.ecommerce.product.Product;
import CoreJavaPractices.src.ecommerce.product.ProductService;

import java.util.List;
import java.util.stream.Collectors;

import java.util.Optional;
public class OrderService {
    private final ProductService productService;
    private final DiscountService discountService;

    public OrderService(ProductService productService, DiscountService discountService) {
        this.productService = productService;
        this.discountService = discountService;
    }

    public Order createOrder( List <String> productNames) {
        List< Product > products = productNames.stream()
                .map(productService::findProduct)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect( Collectors.toList());

        double totalPrice = products.stream()
                .mapToDouble(discountService::applyDiscount)
                .sum();

        return new Order(products, totalPrice);
    }
}
