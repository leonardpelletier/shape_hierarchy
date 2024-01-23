public class Triangle extends Shape {
    
    //Instance Variables
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(String color, boolean filled, double a, double b, double c) {
        super(color, filled);
        setSide1(a);
        setSide2(b);
        setSide3(c);
    }

    //Behaviour Methods
    @Override
    public double calculateArea() {
        // Using Heron's formula for the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    //Accessor and Mutator Methods
    public double getSide1() {
        return side1;
    }

    public void setSide1(double a) {
        this.side1 = a;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double b) {
        this.side2 = b;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double c) {
        this.side3 = c;
    }
}