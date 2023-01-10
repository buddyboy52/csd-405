/*
 * Andrew McCloud
 * January 6, 2023
 * Module 1 Programming Assignment
 * 
 * The purpose of this assignment is to work with two different
 * obstructor types in a class.
 */

public class fans {

    // Declare our constants
    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    final int DEFAULT_RADIUS = 6;
    final String DEFAULT_COLOR = "White";

    // Declare a private int for speed and give it an inital speed of stopped
    private int speed = STOPPED;

    // Declare a private field for the radius of the fan wiht an inital size of 6
    private int radius = DEFAULT_RADIUS;

    // Declare a private boolean field that specifies the on/off value of the fan
    private boolean on;

    // Declare a string field for the color with the default as white
    String color = DEFAULT_COLOR; 

    // Create a getter for the speed
    public int getSpeed(){

        return speed;
    
    }

    // Create a getter for the radius
    public int getRadius(){

        return radius;

    }

    // Create a getter for the fanStatus
    public boolean getFanStatus(){

        return on;

    }

    // Create a getter for the color
    public String getColor(){

        return color;

    }

    // Set the new speed to the old speed variable
    public void setSpeed(int newSpeed){

        this.speed = newSpeed;

    }

    // Set the new radius to the old radius variable
    public void setRadius(int newRadius){

        this.radius = newRadius;

    }

    // Set the new fan status to the old fan status variable
    public void setFanStatus(boolean newFanStatus){

        this.on = newFanStatus;

    }

    // Set the new color to the old color variable
    public void setColor(String newColor){

        this.color = newColor;

    }

    // Create a toString method to display the output
    public String toString(){

        String output = "\nThe fan speed is " + speed + " which means that the fan being on is " + on + ".\nThe " + color + " colored fan has a radius of " + radius ;

        return output;
    }

    // Create a constructor to set all fields back to default
    public fans(){

        // Call the set methods to change the variables back to default
        setSpeed(STOPPED);
        setRadius(DEFAULT_RADIUS);
        setFanStatus(false);
        setColor(DEFAULT_COLOR);

        // Get the output from the toString method
        String output = toString();

        // Display the output
        System.out.println(output);

    }

    // Create a constructor with arguments to change the variables
    public fans(int newSpeed, int newRadius, boolean newFanStatus, String newColor){

        // Call the set methods to change the variables
        setSpeed(newSpeed);
        setRadius(newRadius);
        setFanStatus(newFanStatus);
        setColor(newColor);

        // Get the output from the toString method
        String output = toString();

        // Display the output
        System.out.println(output);
    }

    
}
