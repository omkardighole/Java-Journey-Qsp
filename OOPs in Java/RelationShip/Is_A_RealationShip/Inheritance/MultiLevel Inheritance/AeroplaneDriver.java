// Base class representing a generic Aeroplane
class Aeroplane {
    String brand;
    double price;
    int engines, year, speed, wt;

    // Default constructor
    public Aeroplane() {}

    // Parameterized constructor
    public Aeroplane(String brand, double price, int engines, int year, int speed, int wt) {
        this.brand = brand;
        this.price = price;
        this.engines = engines;
        this.year = year;
        this.speed = speed;
        this.wt = wt;
    }

    // Method to display basic aeroplane information
    public void displayAeroplane() {
        System.out.println("Brand       : " + brand);
        System.out.println("Price       : " + price);
        System.out.println("Engines     : " + engines);
        System.out.println("Year        : " + year);
        System.out.println("Speed       : " + speed + " km/h");
        System.out.println("Weight      : " + wt + " kg");
    }
}

// Intermediate class representing a fighter plane
class FighterPlane extends Aeroplane {
    String model;
    int seat;
    int range;

    // Default constructor
    public FighterPlane() {}

    // Parameterized constructor
    public FighterPlane(String brand, double price, int engines, int year, int speed, int wt,
                        String model, int seats, int range) {
        // Call the constructor of the base class (Aeroplane)
        super(brand, price, engines, year, speed, wt);
        this.model = model;
        this.seat = seats;  // Assign passed seat value correctly
        this.range = range;
    }

    // Method to display fighter plane details (calls base method too)
    public void displayFighterPlane() {
        displayAeroplane(); // Display aeroplane info first
        System.out.println("Model       : " + model);
        System.out.println("Seats       : " + seat);
        System.out.println("Range       : " + range + " km");
    }
}

// Most specific class representing a Sukoi fighter jet
class Sukoi extends FighterPlane {
    String variant;
    String country;
    double topSpeed;

    // Parameterized constructor
    public Sukoi(String brand, double price, int engines, int year, int speed, int wt,
                 String model, int seats, int range,
                 String variant, String country, double topSpeed) {
        // Call constructor of FighterPlane
        super(brand, price, engines, year, speed, wt, model, seats, range);
        this.variant = variant;
        this.country = country;
        this.topSpeed = topSpeed;
    }

    // Method to display Sukoi-specific details
    public void displaySukoi() {
        displayFighterPlane(); // Display fighter plane info first
        System.out.println("Variant     : " + variant);
        System.out.println("Country     : " + country);
        System.out.println("Top Speed   : " + topSpeed + " km/h");
    }
}

// Main driver class to test the multilevel inheritance
public class AeroplaneDriver {
    public static void main(String[] args) {
        // Creating a Sukoi object with all attributes
        Sukoi s = new Sukoi(
            "Sukhoi",       // brand
            62000000.0,     // price
            2,              // engines
            2020,           // year
            1350,           // speed
            18000,          // weight
            "Su-30",        // model
            2,              // seats
            3000,           // range
            "Su-30MKI",     // variant
            "India",        // country
            2120.0          // topSpeed
        );

        // Display all Sukoi jet details
        s.displaySukoi();
    }
}
