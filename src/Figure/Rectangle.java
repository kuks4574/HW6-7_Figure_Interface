package Figure;

public class Rectangle extends Figure {

    Rectangle (double a, double b) {
        super(a, b);
    }
    @Override
    double getPerimeter() {
        System.out.print("Perimetr Rectangle = ");
        return 2*(a + b);
    }
}
