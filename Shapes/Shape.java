public class Shape {
    // Instance Variables / Attributes
    private String color;
    private boolean filled;

    // Constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Behaviour Methods
    public double calculateArea() {
        // To be overridden by subclasses
        return 0;
    }

    public double calculatePerimeter() {
        // To be overridden by subclasses
        return 0;
    }

    public void displayInfo() {
        System.out.println("Shape Information:");
        System.out.println("Color: " + this.color);
        System.out.println("Filled: " + this.filled);
    }

    // Getters and Setters
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}