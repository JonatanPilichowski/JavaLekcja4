package Car;

public class Main {
    public static void main(String[] args) {
        displayCountriesOfInterest();
    }

    private static void displayCountriesOfInterest() {
        DataFactory dataFactory = new DataFactory();
        Car car = new Car();

        car.getSpecifiedCars(dataFactory.getTestCars(), "BMW", 300, true);
    }
}
