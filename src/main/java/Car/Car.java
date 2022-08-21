package Car;

import java.util.List;

public class Car {

    private Producent producent;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    private List<Dimension> dimension;
    public Car() {
    }

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, List<Dimension> dimension) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimension = dimension;
    }

    public void getSpecifiedCars(List<Car> allCars) {
        StringBuilder countriesString = new StringBuilder();
        String a = "";
        for (Car car : allCars) {
            if (car.producent.getModel().equals("BMW")) {
                if (car.isAutomaticGear()) {
                    for (Dimension dim : car.dimension) {
                        if (dim.getTrankCapacityInLiters() > 300) {
                            for (Country country : car.market.countries) {
                                countriesString.append(country.getCountryName());
                                countriesString.append(" - ");
                                countriesString.append(country.getCountrySign());
                                countriesString.append(", ");
                            }
                        }
                    }
                }
            }
        }
        System.out.println("List of countries: " + countriesString);
    }

    public Producent getProducent() {
        return producent;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public void setAutomaticGear(boolean automaticGear) {
        isAutomaticGear = automaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public List<Dimension> getDimension() {
        return dimension;
    }

    public void setDimension(List<Dimension> dimension) {
        this.dimension = dimension;
    }
}
