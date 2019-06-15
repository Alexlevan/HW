package hw10_collections;

public class TestGarage {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Сoupe ferrari = new Сoupe("Ferrari ", "Testarossa ", 1984, "Sport ", "385HP");
        Сoupe lamborghini = new Сoupe("Lamborghini ", "Countach ", 1974, "Sport ", "449HP");
        Convertible mercedes = new Convertible("Mercedes ", "AMG ", 2018, "GT ", "630HP");
        Touring audi = new Touring("Audi ", "RS6 ", 2018, "Executive ", "605HP");

        garage.parkingCar(ferrari);
        garage.parkingCar(lamborghini);
        garage.parkingCar(mercedes);
        garage.parkingCar(audi);

        System.out.println("В наличии");
        garage.description();

        System.out.println("Audi в гараже: " + garage.carNumber(audi) + " ");

        System.out.println("Audi покинул гараж.");
        garage.getCar(audi);
        System.out.println();

        System.out.println("Осталось в гараже:");
        garage.description();
    }
}
