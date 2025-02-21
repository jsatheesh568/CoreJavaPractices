package CoreJavaPractices.src.ecommerce.discount;

import CoreJavaPractices.src.ecommerce.product.Category;
import CoreJavaPractices.src.ecommerce.product.Product;

import java.util.Map;

public class DiscountServiceImpl implements DiscountService {
    private static final Map<Category, Double> DISCOUNT_MAP = Map.of(
            Category.ELECTRONICS, 0.10,
            Category.CLOTHING, 0.05,
            Category.GROCERY, 0.15
    );

    @Override
    public double applyDiscount( Product product) {
        return product.getPrice() * (1 - DISCOUNT_MAP.getOrDefault(product.getCategory(), 0.0));
    }
}
