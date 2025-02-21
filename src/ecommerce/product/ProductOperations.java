package CoreJavaPractices.src.ecommerce.product;

import java.util.List;
import java.util.Optional;

public interface ProductOperations {
    List <Product> getProducts();
    Optional <Product> findProduct( String name);
}
