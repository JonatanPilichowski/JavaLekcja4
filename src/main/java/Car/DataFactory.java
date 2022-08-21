package Car;

import java.util.List;

public class  DataFactory {
    Country poland = new Country("Poland", 'P');
    Country ukraine = new Country("Ukraine", 'U');
    Country canada = new Country("Canada", 'C');
    Country mexico = new Country("Mexico", 'M');
    Country norway = new Country("Norway", 'N');

   List<Country> europeCountries = List.of(poland,ukraine,norway);
   List<Country> exclusiveCountries = List.of(canada,mexico,norway);
   List<Country> cargoCountries = List.of(ukraine,mexico,norway, poland);
   List<Country> businessCountries = List.of(canada,ukraine,norway);
   List<Country> busCountries = List.of(ukraine,mexico,poland);



    Market europeMarket = new Market("Europe", europeCountries);
    Market exclusiveMarket = new Market("Exclusive", exclusiveCountries);
    Market cargoMarket = new Market("Cargo", cargoCountries);
    Market businessMarket = new Market("Business", businessCountries);
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

    List<Dimension> smallCars = List.of(dimension1,dimension2,dimension3);
    List<Dimension> mediumCars = List.of(dimension4, dimension5);
    List<Dimension> mediumExtraCars = List.of(dimension6,dimension7);
    List<Dimension> mediumAndMediumExtraCars = List.of(dimension4, dimension5, dimension6,dimension7);
    List<Dimension> largeCars = List.of(dimension8,dimension9,dimension10);

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

 Car bmwSedan = new Car(bmw,true,europeMarket,"medium",mediumCars);
    Car bmwEco = new Car(bmw,false,europeMarket,"standard",mediumCars);
    Car bmwLarge = new Car(bmw,false,cargoMarket,"standard",largeCars);
    Car bmwPremium = new Car(bmw,true,exclusiveMarket,"exclusive",mediumExtraCars);
    Car bmwBusiness = new Car(bmw,true,europeMarket,"medium",mediumAndMediumExtraCars);
    Car bmwPremiumSmall = new Car(bmw,true,europeMarket,"standard",smallCars);
    Car bmwCargo = new Car(bmw,true,europeMarket,"standard",mediumCars);
    Car opelAstraFamily = new Car(astra,true,cargoMarket,"medium",mediumAndMediumExtraCars);
    Car vectraBusiness = new Car(vectra,true,businessMarket,"premium",mediumExtraCars);
    Car insigniaEurope = new Car(insignia,false,europeMarket,"medium",mediumCars);
    Car modusSenior = new Car(modus,true,europeMarket,"medium",smallCars);
    Car lagunaPremium = new Car(laguna,true,exclusiveMarket,"premium",mediumAndMediumExtraCars);
    Car clioEconomic = new Car(clio, false,europeMarket, "standard", smallCars);
    Car kangooDelivery = new Car(kangoo, true, busMarket,"standard", largeCars);
    Car qashqaiPremium = new Car(qashqai, true, businessMarket, "premium", largeCars);
    Car jukeMedium = new Car(juke, false, europeMarket, "medium", mediumAndMediumExtraCars);

    List<Car> testCars = List.of(bmwSedan, bmwEco, bmwLarge, bmwPremium,bmwBusiness,bmwCargo,bmwPremiumSmall, kangooDelivery);

 public List<Car> getTestCars() {
  return testCars;
 }
}
