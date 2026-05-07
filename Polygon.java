package Day4;

public interface Polygon {
    double getArea();

    // Default method to compute perimeter
    default double getPerimeter(int... sides) {
        double sum = 0;
        for (int side : sides) {
            sum += side;
        }
        return sum;
    }

    // Static helper method
    static String shapeInfo() {
        return "Polygons are 2D shapes with straight sides.";
    }
}
