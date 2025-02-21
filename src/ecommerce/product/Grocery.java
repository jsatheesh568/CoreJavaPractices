package CoreJavaPractices.src.ecommerce.product;

public class Grocery extends Product {
    public Grocery(String name, double price) {
        super(name, price, Category.GROCERY);
    }
}

