public class Trapezium extends Figure{
    private static final String NAME = "Trapezium";
    private double width;
    private double width2;
    private double height;


    public Trapezium(double width, double width2, double height) {
        this.width = width;
        this.width2 = width2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((width + width2)/2) * height;
    }

    @Override
    public int perimeter() {
        return (int) (width + width2 + (height * 2));
    }

    @Override
    public String getName() {
        return NAME;
    }
}
