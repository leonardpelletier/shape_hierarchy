public class Rectangle extends Shape {
    
    //Instance Variables
    private double length;
    private double width;

    // Constructor
   
    
    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        setLength(length);
        setWidth(width);
    }

    //Behaviour Methods
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    //Accessor and Mutator Methods
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}