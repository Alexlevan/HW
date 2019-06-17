package hw15_patterns;

public class Product {
    private String name;
    private Integer listPrice;
    private Integer sellingPrice;

    public Product(String name, Integer listPrice, Integer sellingPrice) {
        this.name = name;
        this.listPrice = listPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public Integer getListPrice() {
        return listPrice;
    }

    public Integer getSellingPrice() {
        return sellingPrice;
    }

    @Override
    public String toString() {
        return "Наименование :" +
                "Производитель = '" + name + '\'' +
                ", Цена поставщика = " + listPrice +
                ", Розничная цена = " + sellingPrice;
    }
}
