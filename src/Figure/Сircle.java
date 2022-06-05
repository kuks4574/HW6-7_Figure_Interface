package Figure;

public class Сircle extends Figure {

    Сircle(double r) {
       super.r = r;
   }
    Сircle(int x, int y ) {
        super(x, y);
    }

    @Override
     public double getPerimeter() {
       return 2*r*PI;
    }

    @Override
    public double getArea() {
        System.out.print("Area = ");
        return PI*(r*r);
    }

    // L = d*π = 2*r*π.

}
