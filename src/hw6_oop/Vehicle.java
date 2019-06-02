package hw6_oop;


public class Vehicle {
    private double distance;
    private double fuel;
    private double fuelConsumption;

    public Vehicle(double fuelConsumption){
        setFuelConsumption(fuelConsumption);
    }

    public void inTank(int l){
        setFuel(getFuel() + l);
    }

    public double trip (double range){
        double road = checkRange();
        if (range > checkRange()){
            setDistance(getDistance() + checkRange());
            setFuel(getFuel() - needFuel(checkRange()));
            return road;
        }
        setDistance(getDistance() + range);
        setFuel(getFuel() - needFuel(range));
        return range;
    }


    public double getDistance() {
        return distance;
    }

    public double getFuel() {
        return fuel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }


    public void setDistance(double distance) {
        this.distance = distance;
    }
    private double checkRange(){
        return getFuelConsumption() * getFuel();

    }

    private double needFuel(double range){
        return (getFuelConsumption() * range / 100);
    }

    public String toString(){
        return "Car{" +
                "fuel=" + fuel +
                ", distance=" + distance +
                ", fuelConsumtion=" + fuelConsumption +
                '}';
    }
}

