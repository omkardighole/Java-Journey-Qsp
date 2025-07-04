interface Connectable {
    void connect();
}

interface WiFiEnabled {
    void enableWiFi();
}

abstract class Device implements Connectable {
    public void connect() {
        System.out.println("Connecting to power...");
    }

    abstract void boot();
}

class Mobile extends Device implements WiFiEnabled {
    public void boot() {
        System.out.println("Mobile booting...");
    }

    public void enableWiFi() {
        System.out.println("WiFi enabled on Mobile");
    }
}

class Laptop extends Device implements WiFiEnabled {
    public void boot() {
        System.out.println("Laptop booting...");
    }

    public void enableWiFi() {
        System.out.println("WiFi enabled on Laptop");
    }
}
