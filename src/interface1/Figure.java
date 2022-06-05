package interface1;

public abstract class Figure {
   public int x, y; // Кординаты
    public double a, b; // Стороны фигуры


    public Figure(int x, int y) {
    this.x = x;
    this.y = y;
}
    public Figure(int x, int y, double a, double b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }
    public abstract double getPerimetr();
    public abstract double getArea();




}
