package Car;

import java.util.List;

public class Car {

    private Producent producent;
    private boolean isAutomaticGear;
    private Market market;
    private List<Dimension> dimension;

    public Car() {
    }

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, List<Dimension> dimension) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.dimension = dimension;
    }

    public void getSpecifiedCars(List<Car> carsList, String carName, int trankCapacityInLiters, boolean isAutomaticGear) {
        StringBuilder displayedResult = new StringBuilder();
        for (Car car : carsList) {
            if (isCarNameAsExpected(carName, car) && isAutomaticGearAsExpected(isAutomaticGear, car)) {
                for (Dimension dim : car.dimension) {
                    if (dim.getTrankCapacityInLiters() > trankCapacityInLiters) {
                        marketToDisplay(displayedResult, car.market.getName());
                        for (Country country : car.market.countries) {
                            countriesToDisplay(displayedResult, country);
                        }
                        break;
                    }
                }
            }
        }
        printMessage(displayedResult);
    }


    private boolean isAutomaticGearAsExpected(boolean isAutomaticGear, Car car) {
        return car.isAutomaticGear == isAutomaticGear;
    }

    private boolean isCarNameAsExpected(String carName, Car car) {
        return car.producent.getModel().equals(carName);
    }

    private void printMessage(StringBuilder displayedResult) {
        System.out.println(displayedResult);
    }

    private void marketToDisplay(StringBuilder countriesResult, String str) {
        countriesResult.append(str);
        countriesResult.append("Market: ");
        countriesResult.append('\n');
    }

    private void countriesToDisplay(StringBuilder countriesResult, Country country) {
        countriesResult.append(country.getCountryName());
        countriesResult.append(" - ");
        countriesResult.append(country.getCountrySign());
        countriesResult.append('\n');
    }


}
