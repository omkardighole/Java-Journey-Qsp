// Base class representing WebDriver (like Selenium WebDriver interface)
class WebDriver {
    public void webDriverMethod() {
        System.out.println("Web Driver Methods");
    }

    public void getcurrentUrl() {
        System.out.println("Web Driver Method for getting URL");
    }

    public void getTitle() {
        System.out.println("Web Driver Method for getting Title");
    }
}

// Child class ChromeDriver extends WebDriver
class ChromeDriver extends WebDriver {
    public void chromeMethods() {
        System.out.println("Chrome Driver Specific Methods");
    }
}

// Child class SafariDriver extends WebDriver
class SafariDriver extends WebDriver {
    public void safariMethods() {
        System.out.println("Safari Driver Specific Methods");
    }
}

// Child class EdgeDriver extends WebDriver
class EdgeDriver extends WebDriver {
    public void edgeMethods() {
        System.out.println("Edge Driver Specific Methods");
    }
}

// Child class OperaDriver extends WebDriver
class OperaDriver extends WebDriver {
    public void operaMethods() {
        System.out.println("Opera Driver Specific Methods");
    }
}

// Main class to run the demonstration
public class Selenium_Hierarchy_Driver {
    public static void main(String[] args) {

        // Upcasting: ChromeDriver object is referred by WebDriver type
        WebDriver w1 = new ChromeDriver();

        // Calling only WebDriver methods using upcasted reference
        w1.webDriverMethod();
        w1.getcurrentUrl();
        w1.getTitle();

        // Downcasting back to ChromeDriver to access child-specific methods
        ChromeDriver c1 = (ChromeDriver) w1;
        c1.chromeMethods();  // ✅ Correct method call after downcasting

        System.out.println("____________________________________________________");

        // Upcasting: SafariDriver object is referred by WebDriver type
        WebDriver w2 = new SafariDriver();

        // Only WebDriver methods accessible via w2
        w2.webDriverMethod();
        w2.getcurrentUrl();
        w2.getTitle();

        // Downcasting to SafariDriver to access specific methods
        SafariDriver s1 = (SafariDriver) w2;
        s1.safariMethods();  // ✅ Correct method call after downcasting
    }
}
