package Figure;

public class Ellipse extends Figure {

    Ellipse(double a, double b) {
        super(a, b);
    }

    Ellipse(int x, int y ) {
        super(x, y);
    }
        @Override
        public double getPerimeter() {
            System.out.print("Ellipse perimetr = ");
            return 4 * ((PI * a * b + (a - b)) / (a + b));
        }

    }

// L = 4*((π*a*b + (a-b))/(a+b))