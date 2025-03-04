package CoreJavaPractices.orderprocessing.product;

import java.util.UUID;

public record Product(UUID id, String name, double price, int stock) {}
