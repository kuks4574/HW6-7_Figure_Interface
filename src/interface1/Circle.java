package interface1;

public class Circle  extends RoundFigures implements Movable {

    Circle(int x, int y, double r) {
        super(x, y, r);


    }

    @Override
    public double getPerimetr() {
        double result = 2*r*PI;
        System.out.print("Perimetr Circle = ");
        return result;
    }

    @Override
    public double getArea() {
        System.out.print("Area circle = ");
        return PI*(r*r);
    }

    @Override
    public void movable(int x, int y) {
        System.out.println("Координаты изменены: x - " + (this.x + 100) + " y - " + (this.y + 100));
    }


}
