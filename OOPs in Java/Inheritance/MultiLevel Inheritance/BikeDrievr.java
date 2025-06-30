class Bike {
    String brand;
    int speed;

    public Bike() {}

    public Bike(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Pulsar extends Bike {
    String model;
    int topSpeed;
    int gear;

    public Pulsar() {}

    public Pulsar(String brand, int speed, String model, int topSpeed, int gear) {
        super(brand, speed);
        this.model = model;
        this.topSpeed = topSpeed;
        this.gear = gear;
    }

    public void displayP() {
        display();
        System.out.println("Model: " + model);
        System.out.println("Top Speed: " + topSpeed);
        System.out.println("Gear: " + gear);
    }
}

class Dominar extends Pulsar {
    String name;

    public Dominar() {}

    public Dominar(String name, String brand, int speed, String model, int topSpeed, int gear) {
        super(brand, speed, model, topSpeed, gear);
        this.name = name;
    }

    public void displayD() {
        displayP();
        System.out.println("Name: " + name);
    }
}

public class BikeDrievr {
    public static void main(String[] args) {
        Dominar d = new Dominar("Dominar 400", "Bajaj", 120, "400cc", 150, 6);
        d.displayD();
    }
}
