package hw15_patterns;

public class ProductFilterByName implements ProductStrategy{

    private final String name;

    public ProductFilterByName(String name) {
        this.name = name;
    }

    @Override
    public boolean filter(Product product) {
        return product.getName().toLowerCase().contains(this.name.toLowerCase());
    }
}
