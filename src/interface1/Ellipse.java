package interface1;

public class Ellipse extends RoundFigures implements Movable, Scalable{

    Ellipse(int x, int y, double a, double b) {
        super(x, y, a, b);

    }

    @Override
    public double getPerimetr() {
        System.out.print("Ellipse perimetr = ");
        return 4 * ((PI * a * b + (a - b)) / (a + b));
    }

    @Override
    public double getArea() {
        System.out.print("Ellipse area = ");
        return PI * a * b;
    }

    @Override
    public void movable(int x, int y) {
        System.out.println("Координаты изменены: x - " + (this.x + 100) + " y - " + (this.y + 100));
    }

    @Override
    public void scalable() {
        System.out.println("Размер изменен: а - " + (this.a + 200) + " b - " + (this.b + 200));
    }
}
