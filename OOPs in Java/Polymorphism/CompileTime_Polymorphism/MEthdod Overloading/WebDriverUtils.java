//Technical Example: Method Overloading in a WebDriver Utility Class


public class WebDriverUtils {

    // Overloaded method to launch browser with just browser name
    public void launchBrowser(String browserName) {
        System.out.println("Launching " + browserName + " with default settings.");
    }

    // Overloaded method to launch browser with browser name and URL
    public void launchBrowser(String browserName, String url) {
        System.out.println("Launching " + browserName + " and navigating to " + url);
    }

    // Overloaded method to launch browser with all custom options
    public void launchBrowser(String browserName, String url, boolean headless) {
        System.out.println("Launching " + browserName + " in " + (headless ? "headless" : "normal") + " mode at " + url);
    }
	//Headless means running a browser without opening its graphical user interface (GUI) — i.e., no visible window,
	//everything runs in the background.

    public static void main(String[] args) {
        WebDriverUtils utils = new WebDriverUtils();
        utils.launchBrowser("Chrome");
        utils.launchBrowser("Firefox", "https://example.com");
        utils.launchBrowser("Edge", "https://example.com", true);
    }
}
/*In automation testing (e.g., using Selenium WebDriver), we often need to launch browsers in different ways:

With just the browser name.

With a browser name and a URL to visit.

With browser name, URL, and options like headless mode (runs without opening a GUI).

 Method Overloading Logic:
We create multiple launchBrowser() methods with the same name but different parameter lists:*/