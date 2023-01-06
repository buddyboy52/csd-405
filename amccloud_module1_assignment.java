// 1/6/2023
// Module 1 Programming Assignment

/*
 * Andrew McCloud
 * January 6, 2023
 * Module 1 Programming Assignment
 * 
 * The purpose of this assignment is to work with two different
 * obstructor types in a class.
 */

public class amccloud_module1_assignment {

    // Declare our constants
    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    // Declare a private int for speed and give it an inital speed of stopped
    private int speed = STOPPED;

    // Declare a private field for the radius of the fan wiht an inital size of 6
    private int radius = 6;

    // Declare a private boolean field that specifies the on/off value of the fan
    private boolean on;

    // Declare a string field for the color with the default as white
    String color = "white"; 

    // Create a getter for the speed
    public int getSpeed(){

        return speed;
    
    }

    public void setSpeed(int newSpeed){



    }

    // Create a getter for the radius
    public int getRadius(){

        return radius;

    }

    public boolean getFanStatus(){

        return on;

    }

    // Create a constructor to set all fields back to default
    



    public static void main(String[] args){



    }
    
}
