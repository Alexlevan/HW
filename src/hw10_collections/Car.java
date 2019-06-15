package hw10_collections;

import java.util.Objects;

/**
 * Создать абстрактный класс Car, представляющий собой автомобиль. Добавить в него поля: марка, модель,год выпуска
 * + несколько своих. Создать 4 класса, являющихся наследниками Car.
 * Переопределить во всех 3-х классах методы equals(), hashCode() и toString() Создать класс Garage,
 * хранящий в себе HashMap автомобилей, в котором ключом является объект автомобиля,
 * значением - количество точно таких автомобилей в гараже.
 * Добавить в класс Garage методы для парковки, выезда авто,
 * а также для получения количества определенного вида автомобилей. Продемонстрировать работу гаража.
 */

public abstract class Car {

    private final String brand;
    private final String model;
    private final Integer year;
    private final String type;
    private final String power;

    public Car(String brand, String model, Integer year, String type, String power) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.type = type;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public String getPower() {
        return power;
    }

    @Override
    public String toString() {
        return " " + brand + " " + model + " " + year + " " + type + " " + power;
    }

    @Override
    public boolean equals(Object i) {
        if (this == i)
            return true;
        if (i == null || getClass() != i.getClass())
            return false;
        Car car = (Car) i;
        return brand.equals(car.brand) && model.equals(car.model) && year.equals(car.year) &&
                type.equals(car.type) && power.equals(car.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, type, power);
    }
}
