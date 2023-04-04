public class base {
    public static void main(String[] args) {
        Figure[] figure = {
                new Rectangle(2, 4),
                new Triangle(5, 8, 5),
                new Circle(2),
                new Square (5, 5),
                new Trapezium (4, 8, 6)
        };

        for(Figure fig : figure) {
            System.out.println(fig.getName() + ": area = " + fig.getArea());
        }

        System.out.println();

        for(Figure fig : figure) {
            System.out.println(fig.getName() + ": perimeter = " + fig.perimeter());
             sum += fig.perimeter();
        }
            System.out.println(sum);
    }
}

