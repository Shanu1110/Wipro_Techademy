package Day4;

public class MainBoth {
    public static void main(String[] args) {
        // ---------------------------
        // Question 1: Movable Shapes
        // ---------------------------
        System.out.println("=== Movable Shapes Simulation ===");

        // MovablePoint demo
        MovablePoint p1 = new MovablePoint(0, 0, 2, 2);
        System.out.println("Point: " + p1);
        p1.moveRight();
        p1.moveDown();
        System.out.println("After moving: " + p1);

        // MovableCircle demo
        MovableCircle circle = new MovableCircle(5, new MovablePoint(1, 1, 1, 1));
        System.out.println(circle);
        circle.moveUp();
        circle.moveLeft();
        System.out.println("After moving: " + circle);

        // MovableRectangle demo
        MovableRectangle rect = new MovableRectangle(
                new MovablePoint(0, 0, 1, 1),
                new MovablePoint(4, 4, 1, 1)
        );
        System.out.println(rect);
        rect.moveDown();
        rect.moveRight();
        System.out.println("After moving: " + rect);

        // ---------------------------
        // Question 2: Polygon Interface
        // ---------------------------
        System.out.println("\n=== Polygon Interface Demo ===");

        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(6, 4);

        System.out.println("Rectangle area: " + r.getArea());
        System.out.println("Rectangle perimeter: " + r.getPerimeter(10, 5, 10, 5));

        System.out.println("Triangle area: " + t.getArea());
        System.out.println("Triangle perimeter: " + t.getPerimeter(6, 4, 5));

        System.out.println(Polygon.shapeInfo());
    }
}
