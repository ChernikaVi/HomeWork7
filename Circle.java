public class Circle extends Figure {
    private static final String NAME = "Circle";

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public int perimeter() {
        double d = radius + radius;
        return (int) (d * Math.PI);
    }

    @Override
    public String getName() {
        return NAME;
    }
}
