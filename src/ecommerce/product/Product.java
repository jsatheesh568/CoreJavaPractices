package CoreJavaPractices.src.ecommerce.product;

public abstract class Product {
    private final String name;
    private final double price;
    private final Category category;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public Category getCategory() { return category; }

    @Override
    public String toString() {
        return name + " - $" + price + " (" + category + ")";
    }
}
