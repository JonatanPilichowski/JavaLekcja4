package Car;

import java.util.List;

public class DataFactory {
    Country poland = new Country("Poland", 'P');
    Country ukraine = new Country("Ukraine", 'U');
    Country canada = new Country("Canada", 'C');
    Country mexico = new Country("Mexico", 'M');
    Country norway = new Country("Norway", 'N');

    List<Country> europeCountries = List.of(poland, ukraine, norway);
    Market europeMarket = new Market("Europe", europeCountries);
    List<Country> exclusiveCountries = List.of(canada, mexico, norway);
    Market exclusiveMarket = new Market("Exclusive", exclusiveCountries);
    List<Country> cargoCountries = List.of(ukraine, mexico, norway, poland);
    Market cargoMarket = new Market("Cargo", cargoCountries);
    List<Country> businessCountries = List.of(canada, ukraine, norway);
    Market businessMarket = new Market("Business", businessCountries);
    List<Country> busCountries = List.of(ukraine, mexico, poland);
    Market busMarket = new Market("Bus", busCountries);


    Dimension dimension1 = new Dimension(100, 200, 250);
    Dimension dimension2 = new Dimension(110, 210, 260);
    Dimension dimension3 = new Dimension(120, 220, 270);
    Dimension dimension4 = new Dimension(130, 230, 280);
    Dimension dimension5 = new Dimension(140, 240, 290);
    Dimension dimension6 = new Dimension(150, 250, 300);
    Dimension dimension7 = new Dimension(160, 260, 310);
    Dimension dimension8 = new Dimension(170, 270, 320);
    Dimension dimension9 = new Dimension(180, 280, 330);
    Dimension dimension10 = new Dimension(190, 290, 340);

    List<Dimension> smallCars = List.of(dimension1, dimension2, dimension3);
    List<Dimension> mediumCars = List.of(dimension4, dimension5);
    List<Dimension> mediumExtraCars = List.of(dimension6, dimension7);
    List<Dimension> mediumAndMediumExtraCars = List.of(dimension4, dimension5, dimension6, dimension7);
    List<Dimension> largeCars = List.of(dimension8, dimension9, dimension10);
    Producent astra = new Producent("Opel", "Astra");
    Producent vectra = new Producent("Opel", "Vectra");
    Producent insignia = new Producent("Opel", "Insignia");
    Producent modus = new Producent("Renault", "Modus");
    Producent laguna = new Producent("Renault", "Laguna");
    Producent clio = new Producent("Renault", "Clio");
    Producent kangoo = new Producent("Renault", "Kangoo");
    Producent qashqai = new Producent("Nissan", "Qashqai");
    Producent bmw = new Producent("BMW", "7");
    Producent juke = new Producent("Nissan", "Juke");
    List<Car> testCars = List.of(
            new Car(bmw, false, europeMarket, "standard", mediumCars),
            new Car(bmw, false, cargoMarket, "standard", largeCars),
            new Car(bmw, true, exclusiveMarket, "exclusive", largeCars),
            new Car(bmw, true, businessMarket, "medium", mediumAndMediumExtraCars),
            new Car(bmw, true, europeMarket, "standard", mediumAndMediumExtraCars),
            new Car(bmw, true, europeMarket, "standard", mediumCars),
            new Car(astra, true, cargoMarket, "medium", mediumAndMediumExtraCars),
            new Car(vectra, true, businessMarket, "premium", mediumExtraCars),
            new Car(insignia, false, europeMarket, "medium", mediumCars),
            new Car(modus, true, europeMarket, "medium", smallCars),
            new Car(laguna, true, exclusiveMarket, "premium", mediumAndMediumExtraCars),
            new Car(clio, false, europeMarket, "standard", smallCars),
            new Car(kangoo, true, busMarket, "standard", largeCars),
            new Car(qashqai, true, businessMarket, "premium", largeCars),
            new Car(juke, false, europeMarket, "medium", mediumAndMediumExtraCars)
    );

    public DataFactory() {
    }

    public List<Car> getTestCars() {
        return testCars;
    }

}

