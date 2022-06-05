package interface1;

public class Rectangle extends SquareFigures implements Movable, Scalable {

    Rectangle(int x, int y, double a, double b) {
        super(x, y, a, b);
    }

    @Override
    public double getPerimetr() {
        System.out.print("Perimetr Rectangle = ");
        return 2*(a + b);
    }

    @Override
    public double getArea() {
        System.out.print("Area Rectangle = ");
        return a * b;
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