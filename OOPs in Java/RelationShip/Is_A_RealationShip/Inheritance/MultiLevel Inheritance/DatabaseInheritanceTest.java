/*Database: General database (e.g., Oracle, MySQL, PostgreSQL).

SQLDatabase: Special type of database that supports SQL queries.

AnalyticsDatabase: Advanced SQL DB that supports report generation (e.g., for business intelligence).*/

// Base class - represents any database
class Database {
    String dbName;

    public Database(String dbName) {
        this.dbName = dbName;
    }

    public void connect() {
        System.out.println("Connecting to database: " + dbName);
    }
}

// First derived class - SQL Database
class SQLDatabase extends Database {
    String sqlVersion;

    public SQLDatabase(String dbName, String sqlVersion) {
        super(dbName); // call base class constructor
        this.sqlVersion = sqlVersion;
    }

    public void runQuery(String query) {
        System.out.println("Running SQL query: \"" + query + "\" on " + sqlVersion);
    }
}

// Second derived class - Analytics Database (used for reports and dashboards)
class AnalyticsDatabase extends SQLDatabase {
    String dashboardTool;

    public AnalyticsDatabase(String dbName, String sqlVersion, String dashboardTool) {
        super(dbName, sqlVersion); // call parent class constructor
        this.dashboardTool = dashboardTool;
    }

    public void generateReport() {
        System.out.println("Generating report using: " + dashboardTool);
    }
}

// Main class to test multilevel inheritance
public class DatabaseInheritanceTest {
    public static void main(String[] args) {
        // Creating an object of AnalyticsDatabase
        AnalyticsDatabase adb = new AnalyticsDatabase("SalesDB", "MySQL 8.0", "Power BI");

        // Call methods from all levels of inheritance
        adb.connect();           // From Database
        adb.runQuery("SELECT * FROM orders");  // From SQLDatabase
        adb.generateReport();    // From AnalyticsDatabase
    }
}
