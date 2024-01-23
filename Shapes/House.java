public class House extends Shape {
    
    //Instance Variables
    Square base;
    Triangle roof;
    
    //Constructor
    public House(String color, boolean filled, double sideLength) {
        super(color, filled);
        base = new Square(color, filled, sideLength);
        roof = new Triangle(color, filled, sideLength, sideLength, sideLength);
    }
    
    //Behaviour Methods
    @Override
    public double calculateArea() {
        return base.calculateArea() + roof.calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return base.getSideLength() * 5;
    }

    //Accessor and Mutator Method
    public double getSize() {
        return base.getSideLength();
    }
    
    public void setSize(double s) {
        base = new Square(getColor(), isFilled(), s);
        roof = new Triangle(getColor(), isFilled(), s, s, s);
    }
    
}
