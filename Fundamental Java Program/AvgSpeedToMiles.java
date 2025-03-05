public class AvgSpeedToMiles {
    public static void main(String[] args) {
        // Given data
        double distanceInKm = 14;  // Distance in km
        int minutes = 45;          // Time in minutes
        int seconds = 30;          // Additional seconds
        double kmToMiles = 1.6;    // Conversion factor from km to miles

        // Convert distance to miles
        double distanceInMiles = distanceInKm / kmToMiles;

        // Convert time to hours
        double timeInHours = (minutes / 60.0) + (seconds / 3600.0);

        // Calculate speed in miles per hour
        double speed = distanceInMiles / timeInHours;

        // Display result
        System.out.printf("The average speed of the runner is: %.2f miles per hour%n", speed);
    }
}
