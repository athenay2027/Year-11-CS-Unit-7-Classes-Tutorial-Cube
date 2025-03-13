import java.util.Scanner;

public class Cube {
    private int side;

    // Constructor that initializes side to 1
    public Cube() {
        this.side = 1;
    }

    // Constructor that takes a single integer argument
    public Cube(int side) {
        setSide(side);
    }

    // Getter method for side
    public int getSide() {
        return side;
    }

    // Setter method for side
    public void setSide(int side) {
        if (side < 1) {
            System.out.println("A cube's side length cannot be less than 1!");
            throw new IllegalArgumentException("A cube's side length must be equal to or greater than 1!");
        }
        this.side = side;
    }

    // Method to calculate the surface area of the cube
    public int calculateSurfaceArea() {
        return 6 * side * side;
    }

    // Method to calculate the volume of the cube
    public int calculateVolume() {
        return side * side * side;
    }

    // toString method to return a string representation of the cube
    @Override
    public String toString() {
        return "Cube{side=" + side + "}";
    }
}