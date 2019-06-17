package hw15_patterns;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    private List<Product> products;

    public ProductService(List<Product> products) {
        this.products = products;
    }

    public List<Product> filter(ProductStrategy filterStrategy) {
        return products.stream()
                .filter(product -> filterStrategy.filter(product))
                .collect(Collectors.toList());
    }
}
