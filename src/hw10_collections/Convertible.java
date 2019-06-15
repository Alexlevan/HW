package hw10_collections;

public class Convertible extends Car {

    public Convertible(String brand, String model, Integer year, String type, String power){
        super(brand, model, year, type, power);
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public boolean equals(Object object){
        return super.equals(object);
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }
}
