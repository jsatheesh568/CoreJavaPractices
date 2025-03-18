package CoreJavaPractices.src.warehouseinventory;

import java.util.Optional;

public interface StorageStrategy {
    void addProduct(Product product);
    Optional <Product> retrieveProduct( String sku);
}
