// Parent class: Represents a generic server
class Server {
    // Instance variables (attributes of Server)
    String ipAddress;
    String hostName;
    String location;
    String os;
    double upTime;

    // Default constructor
    public Server() {
        // No initialization done here
    }

    // Parameterized constructor to initialize server details
    public Server(String ipAddress, String hostName, String location, String os, double upTime) {
        // 'this' refers to the current object's field
        this.ipAddress = ipAddress;     // Assign parameter to class variable
        this.hostName = hostName;
        this.location = location;
        this.os = os;
        this.upTime = upTime;
    }

    // Method to display server information
    public void displayServer() {
        System.out.println("IP Address: " + ipAddress);
        System.out.println("Host Name: " + hostName);
        System.out.println("Location: " + location);
        System.out.println("Operating System: " + os);
        System.out.println("Uptime (in hours): " + upTime);
    }
}

// Child class: Represents a Database Server that extends the generic Server
class DbServer extends Server {
    // Additional attributes specific to database servers
    String dbType;
    String version;
    int port;
    int maxConnections;
    String backUpStatus;

    // Default constructor
    public DbServer() {
        // No initialization here
    }

    // Parameterized constructor that initializes both Server and DbServer attributes
    public DbServer(String ipAddress, String hostName, String location, String os, double upTime,
                    String dbType, String version, int port, int maxConnections, String backUpStatus) {
        super(ipAddress, hostName, location, os, upTime); // Call to Server class constructor
        this.dbType = dbType;               // Initialize database-specific fields
        this.version = version;
        this.port = port;
        this.maxConnections = maxConnections;
        this.backUpStatus = backUpStatus;
    }

    // Method to display full DB server details
    public void displayDbServer() {
        displayServer(); // Call parent method to display server info
        System.out.println("Database Type: " + dbType);
        System.out.println("DB Version: " + version);
        System.out.println("Port: " + port);
        System.out.println("Max Connections: " + maxConnections);
        System.out.println("Backup Status: " + backUpStatus);
    }
}

// Driver class: contains main() method
public class Server_DbServer_Driver {
    public static void main(String[] args) {
        // Create an object of DbServer with full details
        DbServer db = new DbServer(
            "192.168.1.1",        // ipAddress
            "prod-db-server",     // hostName
            "Mumbai DC",          // location
            "LINUX",              // os
            23.0,                 // upTime
            "MySQL",              // dbType
            "8.0.33",             // version
            3306,                 // port
            5,                    // maxConnections
            "Success"             // backUpStatus
        );

        // Display only basic server info
        db.displayServer();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Display full DB server info (including inherited and own fields)
        db.displayDbServer();
    }
}
