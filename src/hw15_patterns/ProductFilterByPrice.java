package hw15_patterns;

public class ProductFilterByPrice implements ProductStrategy{

    private Integer price;

    public ProductFilterByPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean filter(Product product) {
        return this.price >= product.getListPrice() && this.price <= product.getSellingPrice();
    }
}
