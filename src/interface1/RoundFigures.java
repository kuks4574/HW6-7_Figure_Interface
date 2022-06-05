package interface1;

public abstract class RoundFigures extends Figure {
    public double r; // Радиус окружности
    final double PI = 3.14;

    RoundFigures(int x, int y, double r) {
        super(x, y);
        this.r = r;
    }
    RoundFigures(int x, int y, double a, double b) {
        super(x, y, a, b);

    }


}
