public class UseFans {

    // Create a method to display a single fan
    public void displaySingleFan(fans newFan) {

        // Display the fan
        System.out.println("\nThe " + newFan.color + " fan is moving at a speed of " + newFan.getSpeed()
                + ".\nThe fan also has a radius of " + newFan.getRadius());

    }

    // Create a method to display the entire collection of fans
    public void displayMultipleFans(fans[] newFans) {

        System.out.println("\nDisplaying the whole collection of fans\n");

        // Use a for loop to run through the fans array
        for (int x = 0; x < newFans.length; x++) {

            // Display the fan
            System.out.println((x + 1) + ": Fan is " + newFans[x].getColor() + ", the speed is " + newFans[x].getSpeed()
                    + " and the radius of the fan is " + newFans[x].getRadius());

        }

    }

}
