package Figure;

public class DemoFigure {
    public static void main(String[] args) {

        // Круг периметр - длина окружности
        Сircle circle1 = new Сircle( 34.2);
        double c = circle1.getPerimeter();
        System.out.println("Сircumference = " + c);

        // Круг площадь
        Figure circle2 = new Сircle(3.98);
        System.out.println(circle2.getArea());

        // Круг изменение координат
        Figure circle3 = new Сircle(49, 34);
        System.out.println("Координата х = " + circle3.x);
        System.out.println("Координата у = " + circle3.y);
        circle2.ChangeOfCoord();
        System.out.println("Координата х = " + circle3.x);
        System.out.println("Координата у = " + circle3.y);
        System.out.print("\n");

        // Эллипс периметр и изменение координат
        Ellipse ellipse1 = new Ellipse(123.1,23.3);
        System.out.println(ellipse1.getPerimeter());

        Ellipse ellipse2 = new Ellipse(111, 230);
        System.out.println("Координата х = " + ellipse2.x);
        System.out.println("Координата у = " + ellipse2.y);
        ellipse2.ChangeOfCoord();
        System.out.println("Координата х = " + ellipse2.x);
        System.out.println("Координата у = " + ellipse2.y);
        System.out.print("\n");

        // Прямоугольник
        Rectangle rectangle1 = new Rectangle(12.3, 14.1);
        System.out.println(rectangle1.getPerimeter());
        rectangle1.x = 765;
        rectangle1.y = 123;
        System.out.println("Координата х = " + rectangle1.x);
        System.out.println("Координата у = " + rectangle1.y);
        rectangle1.ChangeOfCoord();
        System.out.println("Координата х = " + rectangle1.x);
        System.out.println("Координата у = " + rectangle1.y);






    }




}
