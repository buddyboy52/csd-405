/*
 * Andrew McCloud
 * January 6, 2023
 * Module 1 Programming Assignment
 * 
 * The purpose of this assignment is to work with two different
 * obstructor types in a class.
 */

public class main {

    // Our main method to run the program
    public static void main(String[] args) {

        // Create 4 new fan instances
        fans fan1 = new fans(2, 8, true, "Pink");
        fans fan2 = new fans(12, 20, true, "Blue");
        fans fan3 = new fans(34, 4, true, "Green");
        fans fan4 = new fans(48, 2, true, "Red");

        // Create an instance for the UseFans class
        UseFans fanUsage = new UseFans();

        // Create an array containing all of the fan instances
        fans[] fanArray = { fan1, fan2, fan3, fan4 };

        // Use a for loop to call the displaySingleFan method with all 4 fans
        for (int x = 0; x < fanArray.length; x++) {

            // Display a single fan in the fanUsage class
            fanUsage.displaySingleFan(fanArray[x]);

        }

        // Display the whole fanArray
        fanUsage.displayMultipleFans(fanArray);

    }

}
