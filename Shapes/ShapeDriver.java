public class ShapeDriver {
    
    
    public static void main (String[] args) {
        
        
        
        Shape[] shapes = new Shape[6];
        
        shapes[0] = new Circle("red", true, 10);
        shapes[1] = new Rectangle("orange", true, 10, 5);
        shapes[2] = new Triangle("yellow", true, 10, 10, 10);
        shapes[3] = new Square("green", true, 10);
        shapes[4] = new Pentagon("blue", true, 10);
        shapes[5] = new House("indigo", true, 10);
        
        System.out.println("\nPERIMETERS:");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].calculatePerimeter());
        }
        
        System.out.println("\nAREAS:");
        for (Shape s : shapes) {
            System.out.println(s.calculateArea());
        }
    }
}