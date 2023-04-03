public class Triangle extends Figure {
    private static final String NAME = "Triangle";

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }

    @Override
    public int perimeter() {
        return (int) (sideA + sideB + sideC);
    }

    @Override
    public String getName() {
        return NAME;
    }
}