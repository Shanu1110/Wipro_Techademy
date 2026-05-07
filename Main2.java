package Day4;

public class Main2 {
    public static void main(String[] args) {
        // Rectangle demo
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Rectangle area: " + r.getArea());
        System.out.println("Rectangle perimeter: " + r.getPerimeter(10, 5, 10, 5));

        // Triangle demo
        Triangle t = new Triangle(6, 4);
        System.out.println("Triangle area: " + t.getArea());
        System.out.println("Triangle perimeter: " + t.getPerimeter(6, 4, 5));

        // Static method call
        System.out.println(Polygon.shapeInfo());
    }
}
