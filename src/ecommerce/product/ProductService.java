package CoreJavaPractices.src.ecommerce.product;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProductService implements ProductOperations {
  private final List<Product> products =
      Arrays.asList(
          new Electronics("Laptop", 1200),
          new Electronics("Smartphone", 800),
          new Clothing("T-Shirt", 30),
          new Clothing("Jeans", 50),
          new Grocery("Soap", 50),
          new Grocery("Oil",270));

    @Override
    public List <Product> getProducts() {
        return products;
    }

    @Override
    public Optional <Product> findProduct( String name) {
        return products.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findFirst();
    }
}
