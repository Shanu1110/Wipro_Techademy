package Day4;

public class Main {
    public static void main(String[] args) {
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
    }
}
