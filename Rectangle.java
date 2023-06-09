public class Rectangle extends Figure {
    private static final String NAME = "Rectangle";

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public int perimeter() {
        return (int) ((width * 2) + (height * 2));
    }

    @Override
    public String getName() {
        return NAME;
    }
}