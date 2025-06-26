// Base class
class Product {
    String productId;
    String name;
    double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.println("Price      : ₹" + price);
    }
}

// Derived class 1
class Electronics extends Product {
    int warrantyYears;
    String brand;

    public Electronics(String productId, String name, double price, int warrantyYears, String brand) {
        super(productId, name, price);
        this.warrantyYears = warrantyYears;
        this.brand = brand;
    }

    public void displayElectronics() {
        displayProduct();
        System.out.println("Brand       : " + brand);
        System.out.println("Warranty    : " + warrantyYears + " year(s)");
    }
}

// Derived class 2
class Clothing extends Product {
    String size;
    String material;

    public Clothing(String productId, String name, double price, String size, String material) {
        super(productId, name, price);
        this.size = size;
        this.material = material;
    }

    public void displayClothing() {
        displayProduct();
        System.out.println("Size        : " + size);
        System.out.println("Material    : " + material);
    }
}

// Derived class 3
class Books extends Product {
    String author;
    String genre;

    public Books(String productId, String name, double price, String author, String genre) {
        super(productId, name, price);
        this.author = author;
        this.genre = genre;
    }

    public void displayBooks() {
        displayProduct();
        System.out.println("Author      : " + author);
        System.out.println("Genre       : " + genre);
    }
}

// Main driver class
public class ECommerceTest {
    public static void main(String[] args) {
        Electronics e = new Electronics("PRD101", "Bluetooth Speaker", 1999.0, 1, "JBL");
        Clothing c = new Clothing("PRD202", "T-Shirt", 499.0, "L", "Cotton");
        Books b = new Books("PRD303", "Wings of Fire", 299.0, "A.P.J. Abdul Kalam", "Autobiography");

        System.out.println("\n--- Electronics ---");
        e.displayElectronics();

        System.out.println("\n--- Clothing ---");
        c.displayClothing();

        System.out.println("\n--- Book ---");
        b.displayBooks();
    }
}
