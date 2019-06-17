package hw15_patterns;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Product product1 = new Product("Xiaomi", 100, 250);
        Product product2 = new Product("Samsung", 400, 650);
        Product product3 = new Product("Apple", 350, 900);
        Product product4 = new Product("Google", 300, 600);
        Product product5 = new Product("OnePlus", 290, 500);


        List<Product> products = Arrays.asList(product1, product2, product3, product4, product5);
        ProductService service = new ProductService(products);

        System.out.println(service.filter(new ProductFilterByName("eq")));
        System.out.println(service.filter(new ProductFilterByPrice(350)));
    }

}
