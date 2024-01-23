public class RegularPolygon extends Shape {
    
    // Instance Variables
    private double sideLength;
    private int numSides;
    
    // Constructor
    public RegularPolygon(String color, boolean filled, double s, int n) {
        super(color, filled);
        this.sideLength = s;
        this.numSides   = n;
    }

    
    // Behaviour Methods
    public double calculateArea() {
        return numSides * sideLength * sideLength * 0.25 * (1 / Math.tan(Math.PI / numSides));
    }

    public double calculatePerimeter() {
        return numSides * sideLength;
    }
    
    //Accessor and Mutator Methods
    public double getSideLength() {
        return sideLength;
    }
    
    public int getNumberOfSides() {
        return numSides;
    }
    
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    
    public void setNumberOfSides(int numSides) {
        this.numSides =  numSides;
    }
}
