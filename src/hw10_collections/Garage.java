package hw10_collections;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private Map<Car, Integer> garage = new HashMap<>();


    public Integer carNumber(Car car) {
        return (!this.garage.containsKey(car)) ? 0 : this.garage.get(car);
    }

    public boolean getCar(Car car) {
        if (!this.garage.containsKey(car)) {
            return false;
        }
        this.garage.put(car, this.garage.get(car) - 1);
        if (this.garage.get(car) < 1) {
            this.garage.remove(car);
        }
        return true;
    }

    public void description() {
        for (Map.Entry<Car, Integer> entry : garage.entrySet()) {
            System.out.println(entry.getKey() + ", Количество автомобилей данного типа: " + entry.getValue() + " ");
        }
    }

    public void parkingCar(Car car) {
        this.garage.put(car, this.garage.containsKey(car) ? this.garage.get(car) + 1 : 1);
    }
}
