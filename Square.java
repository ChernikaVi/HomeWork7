public class Square extends Figure {
    private static final String NAME = "Square";

    private int width;
    private int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public int perimeter() {
        return (width * 2) + (height * 2);
    }

    @Override
    public String getName() {
        return NAME;
    }
}
